# AWSLambdaPoC
Lambda Prof of Concept

## Structure
This AWS lambda poc has three handler request classes (LambdaClass1, LambdaClass2, LambdaClass3)

### LambdaClass1 
* <b>implements</b> RequestHandler<Object, String>
* <b>lambda controller</b>: demo.LambdaClass1::handleRequest
* <b>input</b>: Object
  * <b>sample</b>
    ```
    {
        "name": "Cesar",
        "lastname": "Velasquez",
        "age": 30
    }
    ```
* <b>output</b>: String
### LambdaClass2
* <b>implements</b> RequestHandler<String, Person>
* <b>lambda controller</b>: demo.LambdaClass2::handleRequest
* <b>input</b>: String
    * <b>sample</b>
      ```
      "{\"name\": \"Cesar\",\"lastname\": \"Velasquez\",\"age\": 30}"
      ```
* <b>output</b>: Person
### LambdaClass3
* <b>implements</b> RequestHandler<Map, Person>
* <b>lambda controller</b>: demo.LambdaClass3::handleRequest
* <b>input</b>: Map
    * <b>sample</b>
      ```
      {
          "name": "Cesar",
          "lastname": "Velasquez",
          "age": 30
      }
      ```
* <b>output</b>: Person

## Packaging
``
mvn clean compile package
``

## Java Version
* Java 11