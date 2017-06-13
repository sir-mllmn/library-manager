## Search Statistic Microservice

# Purpose

Another one simple java-microservice based on Spring-Boot with hand-made-InMemoryDB

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