# Library Manager Microservice

## Purpose
Simple java-microservice based on SpringBoot with hand-made InMemoryDB for ability to show simple CRUD operations via RESTful API.

## Configuration
Configuration of this microservice is done with the concept of Config Server and to be able to start this microservice config-server-app must be up and healthy. 
library-manager-app.yml - corresponding file which contains necessary properties of this microservice to start. config-server-app reads properties from this file (it located depending on the config - in current case in github repo).
Local properties contains address of config-server-app to refer for properties.

**CRUD operations implementation**
Add book:

POST request to /book with:

body:
```
    {"id":2,"name":"Design Patterns","year":2000,"pages":600}
```
headers:
```
    Content-Type: application/json
```    



    
 