Model-to-Model Transformation Generator
===========================
This is a research project targeted at the generation of model-to-model transformations based on examples.

The generator requires the following input:
* Meta models of source and target, i.e. 
	* [/src/ExampleModels/complexStateMachine/002_complexStateMachine.model](https://github.com/KuehneThomas/model-to-model-transformation-generator/blob/master/src/ExampleModels/complexStateMachine/002_complexStateMachine.model)
	* [/src/ExampleModels/simpleStateMachine/002_simpleStateMachine.model](https://github.com/KuehneThomas/model-to-model-transformation-generator/blob/master/src/ExampleModels/simpleStateMachine/002_simpleStateMachine.model)
* Meta model instances which correlate, i.e.
	* [/src/ExampleModels/complexStateMachine/002_complexStateMachine.hutn](https://github.com/KuehneThomas/model-to-model-transformation-generator/blob/master/src/ExampleModels/complexStateMachine/002_complexStateMachine.hutn)
	* [/src/ExampleModels/simpleStateMachine/002_simpleStateMachine.hutn](https://github.com/KuehneThomas/model-to-model-transformation-generator/blob/master/src/ExampleModels/simpleStateMachine/002_simpleStateMachine.hutn)
	
The output is a model-to-model transformation from the source to the target meta model in [ETL](TODO LINK Epsilon Transformation Language). 

## Usage
* Requirements: 
	* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
	* [Eclipse Epsilon](http://www.eclipse.org/epsilon/)
	* [Microsoft SQL Server 2012](https://www.microsoft.com/en-US/download/details.aspx?id=43351) (Install using the instance Name: MSSQLSERVER11 instead of DEFAULT)
	
* Quick Start:
    * import /src/ into your Eclipse workspace
	* import [/ext/eclipse.userlibraries](https://github.com/KuehneThomas/model-to-model-transformation-generator/blob/master/ext/eclipse.userlibraries) into Eclipse
	* create the MS SQL database using [/src/TransformationGeneratorEvaluation-Database.sql](https://github.com/KuehneThomas/model-to-model-transformation-generator/blob/master/src/TransformationGeneratorEvaluation-Database.sql)
	* execute [/src/TransformationGenerator/src/transformationGenerator/main/Starter.java](https://github.com/KuehneThomas/model-to-model-transformation-generator/blob/master/src/TransformationGenerator/src/transformationGenerator/main/Starter.java): The best solution(s) found will be shown in the output window at the end.
	* evaluate execution using [/src/TransformationGeneratorEvaluation.xlsx](https://github.com/KuehneThomas/model-to-model-transformation-generator/blob/master/src/TransformationGeneratorEvaluation.xlsx): shows fitness convergence and provides an overview of the fitness landscape.
	
## Documentation
The quality of the transformation depends on the examples. Additionally, the generator is limited to the creation of a sub-set of all transformations. Thus, the solution might be incomplete and must be refined manually. For more information please read the publications:
* [Automatic Generation of Model-to-Model Transformations using Evolutionary and Swarm-Intelligent Algorithms](https://github.com/KuehneThomas/model-to-model-transformation-generator/blob/master/doc/Thesis/Thesis.pdf) Thomas Kühne
* [Patterns for Constructing Mutation Operators: Limiting the Search Space in a Software Engineering Application](http://www.springer.com/978-3-319-30667-4) Thomas Kühne, Heiko Hamann, Svetlana Arifulina and Gregor Engels; LNCS 9594, p. 278 ff.
