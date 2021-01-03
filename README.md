# Bookshop Project

![Docker](https://www.docker.com/sites/default/files/d8/2019-07/Moby-logo.png)

### Getting Started

Plase pull two necessary containers from docker hub. One of them is for our app and the other is for mysql database.
Then create a network so that these two containers can communicate. After that, you can
start containers. Required commands:

* docker pull ebubekirdurukal/mysqldb
* docker pull ebubekirdurukal/bookshop:latest
* docker network create bookshop-mysql
* docker container run --name mysqldb --network bookshop-mysql -e MYSQL_ROOT_PASSWORD=.Admin2020 -e MYSQL_DATABASE=bookShop -d mysql:8
* docker container run --network bookshop-mysql --name bookshop-container -p 8080:8080 -d ebubekirdurukal/bookshop

If you are not going to use docker, change the line about datasource in application.properties file.


### API Documentation

In order to understand and test contoller methods better, you can refer to the swagger documentation after you start the app.

* [Official Bookshop documentation](http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config)


### Postman Collection for API calls

Postman collection for testing purposes can be downloaded using the link below.

* [Download Colection for testing the endpoints](https://www.getpostman.com/collections/922273bdfbc25e4f4ca3)

### About Database

Mysql database is used in this project. Initialization script is under resources folder and it is executed automatically.
You can start using the app directly.


### About Entities

There are 4 entities in this project: Book, BookStore, Category and CatalogRegistration. First three are self-explatory.
Catalog registration is the entity used for representing the ManyToMany relation between Book and BookStore. It can be
thought as book record in which you can find all the information about book and stores.

### About Book Prices





