USE [master]
GO
/****** Object:  Database [TransformationGenerator]    Script Date: 22.06.2014 13:40:02 ******/
CREATE DATABASE [TransformationGenerator]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'TransformationGenerator', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER11\MSSQL\DATA\TransformationGenerator.mdf' , SIZE = 26727424KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'TransformationGenerator_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER11\MSSQL\DATA\TransformationGenerator_log.ldf' , SIZE = 1024KB , MAXSIZE = 5120000KB , FILEGROWTH = 10%)
GO
ALTER DATABASE [TransformationGenerator] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [TransformationGenerator].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [TransformationGenerator] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [TransformationGenerator] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [TransformationGenerator] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [TransformationGenerator] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [TransformationGenerator] SET ARITHABORT OFF 
GO
ALTER DATABASE [TransformationGenerator] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [TransformationGenerator] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [TransformationGenerator] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [TransformationGenerator] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [TransformationGenerator] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [TransformationGenerator] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [TransformationGenerator] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [TransformationGenerator] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [TransformationGenerator] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [TransformationGenerator] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [TransformationGenerator] SET  DISABLE_BROKER 
GO
ALTER DATABASE [TransformationGenerator] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [TransformationGenerator] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [TransformationGenerator] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [TransformationGenerator] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [TransformationGenerator] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [TransformationGenerator] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [TransformationGenerator] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [TransformationGenerator] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [TransformationGenerator] SET  MULTI_USER 
GO
ALTER DATABASE [TransformationGenerator] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [TransformationGenerator] SET DB_CHAINING OFF 
GO
ALTER DATABASE [TransformationGenerator] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [TransformationGenerator] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
EXEC sys.sp_db_vardecimal_storage_format N'TransformationGenerator', N'ON'
GO
USE [TransformationGenerator]
GO
/****** Object:  StoredProcedure [dbo].[RecreateConfigurationStatisticsPerGeneration]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO




CREATE PROCEDURE [dbo].[RecreateConfigurationStatisticsPerGeneration] 
AS
BEGIN
--TRUNCATE TABLE [dbo].[ConfigurationStatisticsPerGeneration]

DECLARE @ConfigurationId int
SET @ConfigurationId = null;
EXECUTE [dbo].[UpdateConfigurationStatisticsPerGeneration] @ConfigurationId
END







GO
/****** Object:  StoredProcedure [dbo].[UpdateConfigurationStatistics]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO





CREATE PROCEDURE [dbo].[UpdateConfigurationStatistics] (@ConfigurationId int)
AS
BEGIN

UPDATE  [dbo].[Configuration] SET 

	[Configuration].FitnessMinimum_to_FitnessQ1 = Data.FitnessMinimum_to_FitnessQ1,
	[Configuration].FitnessQ1 = Data.FitnessQ1,
	[Configuration].FitnessQ1_to_FitnessMedian = Data.FitnessQ1_to_FitnessMedian,
	[Configuration].FitnessMedian_to_FitnessQ3 = Data.FitnessMedian_to_FitnessQ3,
	[Configuration].FitnessQ3_to_FitnessMaximum = Data.FitnessQ3_to_FitnessMaximum,
	[Configuration].AverageRuntime = Data.AverageRuntime

	FROM
	(	SELECT ConfigurationId, 
		FitnessQ1 - FitnessMinimum AS FitnessMinimum_to_FitnessQ1, 
		FitnessQ1, 
		FitnessMedian - FitnessQ1 AS FitnessQ1_to_FitnessMedian, 
		FitnessQ3 - FitnessMedian AS FitnessMedian_to_FitnessQ3, 
		FitnessMaximum - FitnessQ3 AS FitnessQ3_to_FitnessMaximum,
		AverageRuntime

		FROM
		(
		SELECT DISTINCT ConfigurationId
			  ,MAX([Fitness]) OVER(PARTITION BY [ConfigurationId]) AS FitnessMaximum
			  ,PERCENTILE_CONT(0.75) WITHIN GROUP (ORDER BY [Fitness]) 
									OVER (PARTITION BY [ConfigurationId]) AS FitnessQ3
			  ,AVG([Fitness]) OVER(PARTITION BY [ConfigurationId]) AS FitnessAverage
			  ,PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY [Fitness]) 
									OVER (PARTITION BY [ConfigurationId]) AS FitnessMedian
			  ,PERCENTILE_CONT(0.25) WITHIN GROUP (ORDER BY [Fitness]) 
									OVER (PARTITION BY [ConfigurationId]) AS FitnessQ1
			  ,MIN([Fitness]) OVER(PARTITION BY [ConfigurationId]) AS FitnessMinimum
			  ,AVG(DATEDIFF(second, [CreatedAt],[CompletedAt])) OVER(PARTITION BY [ConfigurationId]) AS AverageRuntime
		  FROM [dbo].[PopulationAllGenerations] 
		  WHERE ConfigurationId = @ConfigurationId OR @ConfigurationId IS NULL
		) AS RawData 
	) AS Data

	WHERE [Configuration].Id = ConfigurationId AND
	([Configuration].Id = @ConfigurationId OR @ConfigurationId IS NULL)
END





GO
/****** Object:  StoredProcedure [dbo].[UpdateConfigurationStatisticsPerGeneration]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[UpdateConfigurationStatisticsPerGeneration] (@ConfigurationId int)
AS
BEGIN
--TRUNCATE TABLE [dbo].[ConfigurationStatisticsPerGeneration]

DELETE FROM [dbo].[ConfigurationStatisticsPerGeneration] WHERE ConfigurationId = @ConfigurationId  OR @ConfigurationId IS NULL

INSERT INTO  [dbo].[ConfigurationStatisticsPerGeneration] SELECT ConfigurationId, 
	FitnessQ1 - FitnessMinimum AS FitnessMinimum_to_FitnessQ1, 
	FitnessQ1, 
	FitnessMedian - FitnessQ1 AS FitnessQ1_to_FitnessMedian, 
	FitnessQ3 - FitnessMedian AS FitnessMedian_to_FitnessQ3, 
	FitnessMaximum - FitnessQ3 AS FitnessQ3_to_FitnessMaximum,
	[Generation],
	NULL AS [NumberOfPopulations]
	FROM
(
SELECT DISTINCT ConfigurationId
	  ,[Generation]
	  ,MAX([Fitness]) OVER(PARTITION BY [ConfigurationId], [Generation]) AS FitnessMaximum
	  ,PERCENTILE_CONT(0.75) WITHIN GROUP (ORDER BY [Fitness]) 
                            OVER (PARTITION BY [ConfigurationId], [Generation]) AS FitnessQ3
	  ,AVG([Fitness]) OVER(PARTITION BY [ConfigurationId], [Generation]) AS FitnessAverage
	  ,PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY [Fitness]) 
                            OVER (PARTITION BY [ConfigurationId], [Generation]) AS FitnessMedian
	  ,PERCENTILE_CONT(0.25) WITHIN GROUP (ORDER BY [Fitness]) 
                            OVER (PARTITION BY [ConfigurationId], [Generation]) AS FitnessQ1
	  ,MIN([Fitness]) OVER(PARTITION BY [ConfigurationId], [Generation]) AS FitnessMinimum
	  --,COUNT(*) OVER(PARTITION BY [ConfigurationId], [Generation], [PopulationId]) AS [NumberOfPopulations]
  FROM [dbo].[PopulationAllGenerations] 
  WHERE ConfigurationId = @ConfigurationId OR @ConfigurationId IS NULL -- NOT EXISTS(SELECT * FROM [dbo].[ConfigurationStatisticsPerGeneration] cache WHERE cache.ConfigurationId = [PopulationAllGenerations].ConfigurationId)
) AS RawData
END


UPDATE [dbo].[ConfigurationStatisticsPerGeneration] SET NumberOfPopulations = 
(
 SELECT COUNT(*) FROM 
	(SELECT DISTINCT sub.[ConfigurationId], sub.[Generation], sub.[PopulationId] 
	 FROM [PopulationAllGenerations] sub 
	 WHERE sub.ConfigurationId = [ConfigurationStatisticsPerGeneration].ConfigurationId
	 AND sub.Generation = [ConfigurationStatisticsPerGeneration].Generation) AS r
 --GROUP BY [ConfigurationId], [Generation]
 --ORDER BY Generation
) WHERE ConfigurationId = @ConfigurationId OR @ConfigurationId IS NULL


GO
/****** Object:  Table [dbo].[Configuration]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Configuration](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[InputMetaModel] [nvarchar](1000) NULL,
	[OutputMetaModel] [nvarchar](1000) NULL,
	[PopulationSize] [int] NULL,
	[MaximumNumberOfGenerations] [int] NULL,
	[SelectionAndReplicationAlgorithm] [nvarchar](1000) NULL,
	[FitnessFunction] [nvarchar](1000) NULL,
	[MutationOperatorSelection] [nvarchar](1000) NULL,
	[FitnessMinimum_to_FitnessQ1] [float] NULL,
	[FitnessQ1] [float] NULL,
	[FitnessQ1_to_FitnessMedian] [float] NULL,
	[FitnessMedian_to_FitnessQ3] [float] NULL,
	[FitnessQ3_to_FitnessMaximum] [float] NULL,
	[AverageRuntime] [float] NULL,
	[NumberOfSolutions] [int] NULL,
 CONSTRAINT [PK_Configuration] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ConfigurationStatisticsPerGeneration]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ConfigurationStatisticsPerGeneration](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[ConfigurationId] [int] NOT NULL,
	[FitnessMinimum_to_FitnessQ1] [float] NOT NULL,
	[FitnessQ1] [float] NOT NULL,
	[FitnessQ1_to_FitnessMedian] [float] NOT NULL,
	[FitnessMedian_to_FitnessQ3] [float] NOT NULL,
	[FitnessQ3_to_FitnessMaximum] [float] NOT NULL,
	[Generation] [int] NOT NULL,
	[NumberOfPopulations] [int] NULL,
 CONSTRAINT [PK_ConfigurationStatisticsPerGeneration] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Individual]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Individual](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[PopulationId] [int] NOT NULL,
	[Individual] [int] NULL,
	[Generation] [int] NOT NULL,
	[Fitness] [float] NOT NULL,
	[CreatedAt] [datetime] NULL,
 CONSTRAINT [PK_Individual] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Population]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Population](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[ConfigurationId] [int] NULL,
	[ResultSourceCode] [nvarchar](max) NULL,
	[Completed] [bit] NULL,
	[ContainsBugs] [bit] NULL,
	[CreatedAt] [datetime] NOT NULL,
	[CompletedAt] [datetime] NULL,
 CONSTRAINT [PK_Population] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PossibleMutation]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PossibleMutation](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[IndividualId] [int] NOT NULL,
	[MutationOperator] [nvarchar](1000) NOT NULL,
	[MutationOption] [nvarchar](max) NULL,
	[FitnessBefore] [float] NOT NULL,
	[FitnessAfter] [float] NOT NULL,
 CONSTRAINT [PK_PossibleMutations] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  View [dbo].[PopulationAllGenerations]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO



CREATE VIEW [dbo].[PopulationAllGenerations] 
AS
SELECT Individual.Id, p.Id AS PopulationId, p.ConfigurationId, Generation, CASE WHEN Individual.Fitness < 0 THEN 0 ELSE Individual.Fitness END AS Fitness, p.CreatedAt, p.CompletedAt FROM dbo.Individual
JOIN dbo.Population p ON PopulationId = p.Id
WHERE Completed = 1 AND (ContainsBugs = 0 OR ContainsBugs IS NULL)




GO
/****** Object:  View [dbo].[ConfigurationsWithSolutions]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[ConfigurationsWithSolutions] AS
SELECT 
  c.[InputMetaModel],
  c.[PopulationSize],
  c.[MaximumNumberOfGenerations],
  c.[SelectionAndReplicationAlgorithm],
  c.[FitnessFunction],
  c.[MutationOperatorSelection],
  c.[AverageRuntime],
  r.NumberOfSolutions
  FROM (SELECT ConfigurationId, COUNT(*) AS NumberOfSolutions 
		FROM [PopulationAllGenerations] p
		WHERE p.Fitness = 100.
		GROUP BY p.ConfigurationId) AS r
  JOIN Configuration c ON c.Id = r.ConfigurationId
  --ORDER BY NumberOfSolutions, [AverageRuntime] DESC 
GO
/****** Object:  View [dbo].[oldPossibleMutationAllGenerations]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO



CREATE VIEW [dbo].[oldPossibleMutationAllGenerations] AS
SELECT * FROM (
	SELECT p.Id AS PopulationId,MAX(i.Fitness) OVER(PARTITION BY p.Id, Generation) AS FitnessMaximumInPopulation,
		   p.MutationOperatorSelection, i.Generation, pm.MutationOperator, pm.FitnessBefore, pm.FitnessAfter, pm.FitnessAfter - pm.FitnessBefore AS FitnessChange,
		   i.Fitness 
	FROM 
			(SELECT IndividualId, MutationOperator, CASE WHEN pm.FitnessBefore < 0 THEN 0 ELSE pm.FitnessBefore END AS FitnessBefore, CASE WHEN pm.FitnessAfter < 0 THEN 0 ELSE pm.FitnessAfter END AS FitnessAfter FROM PossibleMutation pm ) AS pm
	JOIN Individual i ON i.Id = pm.IndividualId
	JOIN Population p ON p.Id = i.PopulationId 
--WHERE p.Completed = 1
) AS RawData
WHERE Fitness = FitnessMaximumInPopulation



GO
/****** Object:  View [dbo].[oldPossibleMutationPerGenerationAndMutationOperatorStatistics]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO




CREATE VIEW [dbo].[oldPossibleMutationPerGenerationAndMutationOperatorStatistics] AS

SELECT PopulationId, FitnessMaximumInPopulation, Generation, MutationOperator, MutationOperatorSelection,
	FitnessChangeQ1 - FitnessChangeMinimum AS FitnessChangeMinimum_to_FitnessChangeQ1, 
	FitnessChangeQ1, 
	FitnessChangeMedian - FitnessChangeQ1 AS FitnessChangeQ1_to_FitnessChangeMedian, 
	FitnessChangeQ3 - FitnessChangeMedian AS FitnessChangeMedian_to_FitnessChangeQ3, 
	FitnessChangeMaximum - FitnessChangeQ3 AS FitnessChangeQ3_to_FitnessChangeMaximum,
	MutationOptions
	FROM
(
 SELECT DISTINCT PopulationId, FitnessMaximumInPopulation, Generation, MutationOperator, MutationOperatorSelection
	  ,MAX([FitnessChange]) OVER(PARTITION BY Generation, MutationOperator, MutationOperatorSelection) AS FitnessChangeMaximum
	  ,PERCENTILE_CONT(0.75) WITHIN GROUP (ORDER BY [FitnessChange]) 
                            OVER (PARTITION BY Generation, MutationOperator, MutationOperatorSelection) AS FitnessChangeQ3
	  ,AVG([FitnessChange]) OVER(PARTITION BY Generation, MutationOperator, MutationOperatorSelection) AS FitnessChangeAverage
	  ,PERCENTILE_CONT(0.50) WITHIN GROUP (ORDER BY [FitnessChange]) 
                            OVER (PARTITION BY Generation, MutationOperator, MutationOperatorSelection) AS FitnessChangeMedian
	  ,PERCENTILE_CONT(0.25) WITHIN GROUP (ORDER BY [FitnessChange]) 
                            OVER (PARTITION BY Generation, MutationOperator, MutationOperatorSelection) AS FitnessChangeQ1
	  ,MIN([FitnessChange]) OVER(PARTITION BY Generation, MutationOperator, MutationOperatorSelection) AS FitnessChangeMinimum
	  ,COUNT(*) OVER(PARTITION BY Generation, MutationOperator, MutationOperatorSelection) AS MutationOptions
  FROM (SELECT PopulationId, FitnessMaximumInPopulation, Generation, MutationOperator, MutationOperatorSelection, FitnessBefore + 100 AS FitnessBefore, FitnessAfter + 100 AS FitnessAFter, FitnessChange + 100 AS FitnessChange FROM [TransformationGenerator].[dbo].PossibleMutationAllGenerations ) RawDataInner
) AS RawData



GO
/****** Object:  View [dbo].[oldPossibleMutationPerGenerationStatistics]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO




CREATE VIEW [dbo].[oldPossibleMutationPerGenerationStatistics] AS

SELECT PopulationId, FitnessMaximumInPopulation, Generation, MutationOperatorSelection,
	FitnessChangeQ1 - FitnessChangeMinimum AS FitnessChangeMinimum_to_FitnessChangeQ1, 
	FitnessChangeQ1, 
	FitnessChangeMedian - FitnessChangeQ1 AS FitnessChangeQ1_to_FitnessChangeMedian, 
	FitnessChangeQ3 - FitnessChangeMedian AS FitnessChangeMedian_to_FitnessChangeQ3, 
	FitnessChangeMaximum - FitnessChangeQ3 AS FitnessChangeQ3_to_FitnessChangeMaximum,
	MutationOptions
	FROM
(
 SELECT DISTINCT PopulationId, FitnessMaximumInPopulation, Generation, MutationOperatorSelection
	  ,MAX([FitnessChange]) OVER(PARTITION BY Generation, MutationOperatorSelection) AS FitnessChangeMaximum
	  ,PERCENTILE_CONT(0.75) WITHIN GROUP (ORDER BY [FitnessChange]) 
                            OVER (PARTITION BY Generation, MutationOperatorSelection) AS FitnessChangeQ3
	  ,AVG([FitnessChange]) OVER(PARTITION BY Generation, MutationOperatorSelection) AS FitnessChangeAverage
	  ,PERCENTILE_CONT(0.50) WITHIN GROUP (ORDER BY [FitnessChange]) 
                            OVER (PARTITION BY Generation, MutationOperatorSelection) AS FitnessChangeMedian
	  ,PERCENTILE_CONT(0.25) WITHIN GROUP (ORDER BY [FitnessChange]) 
                            OVER (PARTITION BY Generation, MutationOperatorSelection) AS FitnessChangeQ1
	  ,MIN([FitnessChange]) OVER(PARTITION BY Generation, MutationOperatorSelection) AS FitnessChangeMinimum 
	  ,COUNT(*) OVER(PARTITION BY Generation, MutationOperatorSelection) AS MutationOptions
  FROM (SELECT PopulationId, Generation, FitnessMaximumInPopulation, MutationOperatorSelection, FitnessBefore + 100 AS FitnessBefore, FitnessAfter + 100 AS FitnessAFter, FitnessChange + 100 AS FitnessChange FROM [TransformationGenerator].[dbo].PossibleMutationAllGenerations ) RawDataInner
) AS RawData




GO
/****** Object:  View [dbo].[PopulationAllGenerationStatistics]    Script Date: 22.06.2014 13:40:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[PopulationAllGenerationStatistics] 
AS
SELECT ConfigurationId,
	c.[InputMetaModel],
	c.[OutputMetaModel],
	c.[PopulationSize],
	c.[MaximumNumberOfGenerations],
	c.[SelectionAndReplicationAlgorithm],
	c.[FitnessFunction],
	c.[MutationOperatorSelection],
	cg.[Generation],
	cg.[FitnessMinimum_to_FitnessQ1],
	cg.[FitnessQ1],
	cg.[FitnessQ1_to_FitnessMedian],
	cg.[FitnessMedian_to_FitnessQ3],
	cg.[FitnessQ3_to_FitnessMaximum],
	cg.[NumberOfPopulations]
FROM Configuration c
JOIN ConfigurationStatisticsPerGeneration cg ON c.Id = cg.ConfigurationId


GO
/****** Object:  Index [NonClusteredIndex-ConfigurationId]    Script Date: 22.06.2014 13:40:02 ******/
CREATE NONCLUSTERED INDEX [NonClusteredIndex-ConfigurationId] ON [dbo].[ConfigurationStatisticsPerGeneration]
(
	[ConfigurationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [NonClusteredIndex-Generation]    Script Date: 22.06.2014 13:40:02 ******/
CREATE NONCLUSTERED INDEX [NonClusteredIndex-Generation] ON [dbo].[Individual]
(
	[Generation] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [NonClusteredIndex-PopulationIdWithFitness]    Script Date: 22.06.2014 13:40:02 ******/
CREATE NONCLUSTERED INDEX [NonClusteredIndex-PopulationIdWithFitness] ON [dbo].[Individual]
(
	[PopulationId] ASC
)
INCLUDE ( 	[Generation],
	[Fitness]) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [NonClusteredIndex-ConfigurationId]    Script Date: 22.06.2014 13:40:02 ******/
CREATE NONCLUSTERED INDEX [NonClusteredIndex-ConfigurationId] ON [dbo].[Population]
(
	[ConfigurationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[ConfigurationStatisticsPerGeneration]  WITH CHECK ADD  CONSTRAINT [FK_ConfigurationStatisticsPerGeneration_ConfigurationId] FOREIGN KEY([ConfigurationId])
REFERENCES [dbo].[Configuration] ([Id])
GO
ALTER TABLE [dbo].[ConfigurationStatisticsPerGeneration] CHECK CONSTRAINT [FK_ConfigurationStatisticsPerGeneration_ConfigurationId]
GO
ALTER TABLE [dbo].[Individual]  WITH CHECK ADD  CONSTRAINT [FK_Individual_PopulationId] FOREIGN KEY([PopulationId])
REFERENCES [dbo].[Population] ([Id])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Individual] CHECK CONSTRAINT [FK_Individual_PopulationId]
GO
ALTER TABLE [dbo].[Population]  WITH CHECK ADD  CONSTRAINT [FK_Population_ConfigurationId] FOREIGN KEY([ConfigurationId])
REFERENCES [dbo].[Configuration] ([Id])
GO
ALTER TABLE [dbo].[Population] CHECK CONSTRAINT [FK_Population_ConfigurationId]
GO
ALTER TABLE [dbo].[PossibleMutation]  WITH CHECK ADD  CONSTRAINT [FK_PossibleMutation_IndividualId] FOREIGN KEY([IndividualId])
REFERENCES [dbo].[Individual] ([Id])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[PossibleMutation] CHECK CONSTRAINT [FK_PossibleMutation_IndividualId]
GO
USE [master]
GO
ALTER DATABASE [TransformationGenerator] SET  READ_WRITE 
GO

