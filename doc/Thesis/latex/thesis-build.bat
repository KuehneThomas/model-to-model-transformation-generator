@echo off
if "%~x1"==".tex" goto pdflatex
   echo "%~f1" is not a recognized type, extension is "%~x1"
   pause
   exit /b
 
:pdflatex
   cd /d "%~dp1"
   IF NOT EXIST "%~dp1\build" mkdir build
 
   start "inverseSearch" /min "%PROGRAMFILES(x86)%\SumatraPDF\SumatraPDF.exe" -inverse-search "\"%PROGRAMFILES(x86)%\Notepad++\notepad++.exe\" -n%%l \"%%f\"" -reuse-instance
 
   pdflatex.exe -draftmode -interaction=batchmode -aux-directory="%~pd1\build" -output-directory="%~pd1\build" "%~pdn1"
   echo. && echo.
   bibtex.exe "%~dp1\build\%~n1.aux"
   echo. && echo.
   
   cd /d "%~dp1\build"
   makeglossaries "%~n1"
   echo. && echo.
   cd /d "%~dp1"
   
   pdflatex.exe -draftmode -interaction=batchmode -aux-directory="%~pd1\build" -output-directory="%~pd1\build" "%~pdn1"
   echo. && echo.
   pdflatex.exe -interaction=batchmode -synctex=-1 -aux-directory="%~pd1\build" -output-directory="%~pd1\build" -quiet "%~pdn1"
   echo. && echo.
   
   echo ----------------------------------
   echo WARNINGS:
   type "%~dp1\build\%~n1.log" | findstr Warning:
   
   echo ----------------------------------
   echo ERRORS:
   type "%~dp1\build\%~n1.log" | findstr Error:
   
   start "openPDF" "%PROGRAMFILES(x86)%\SumatraPDF\SumatraPDF.exe"  "%~dp1\build\%~n1.pdf" -reuse-instance
 
   set /a line=%2+1
   echo SUMATRA>"%~dp1\build\cmcdde.tmp"
   echo control>>"%~dp1\build\cmcdde.tmp"  
   cd /d "%~dp1\build"
   echo [ForwardSearch("%~dp1\build\%~n1.pdf", "%~f3", %line%, 0, 0, 0)]>>"cmcdde.tmp"
 
   "%PROGRAMFILES(x86)%\CMCDDE\cmcdde.exe" @"cmcdde.tmp"
 
   del "cmcdde.tmp"
   exit /b