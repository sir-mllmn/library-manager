# Library Manager Microservice

## Purpose
Simple java-microservice based on SpringBoot with usaghe of Cassandra  
for ability to show simple CRUD operations via RESTful API.

## Configuration
Configuration of this microservice is done with the concept of Config Server and to be able to start this microservice config-server-app must be up and healthy. 
library-manager-app.yml - corresponding file which contains necessary properties of this microservice to start. config-server-app reads properties from this file (it located depending on the config - in current case in github repo).
Local properties contains address of config-server-app to refer for properties.

Before start it's necessary to run initial script init.cql via command in shell:
```
cqlsh -f init.cql
``` 

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



    
 