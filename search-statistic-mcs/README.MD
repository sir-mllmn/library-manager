## Search Statistic Microservice

# Purpose

Another one simple java-microservice based on Spring-Boot with hand-made-InMemoryDB

## Configuration
Configuration of this microservice is done with the concept of Config Server and to be able to start this microservice config-server-app must be up and healthy. 
search-statistic-app.yml - corresponding file which contains necessary properties of this microservice to start. config-server-app reads properties from this file (it located depending on the config - in current case in github repo).
Local properties contains address of config-server-app to refer for properties.

**CRUD operations implementation**

Add statistic:

POST request to /book with:

body:
```
      {
        "userName": "Anonymous",
        "ip": "127.0.0.2",
        "browser": "Chrome"
        },
        "applicationName": "ubuntu 16.04",
        "bookId": 0
      }
    
```
headers:
```
    Content-Type: application/json
```