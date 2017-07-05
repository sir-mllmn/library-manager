## Config Server Microservice

# Purpose

Simple implementation of Config Server concept to have configuration
stored in github. Each microservice has it's own config file i.e. :
library-manager-app microservice has it's config in library-manager-app.yml file.
search-statistic-app microservice accordingly in search-statistic-app.yml file.

``
    /monitor 
`` endpoint available for GitHub webhook on push event i.e.