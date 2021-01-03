# Bookshop Project

<img src="https://www.docker.com/sites/default/files/d8/2019-07/Moby-logo.png" width="150" height="100" />
<img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" width="150" height="100" />
<img src="https://www.mysql.com/common/logos/logo-mysql-170x115.png" width="150" height="100" />




Bookshop is a java based book registration application.

### Getting Started

Please pull two necessary containers from docker hub. One of them is for the spring app and the other is for mysql database.
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

* [Collection for testing the endpoints](https://www.getpostman.com/collections/922273bdfbc25e4f4ca3)

### About Database

Mysql database is used in this project. Initialization script is under resources folder and it is executed automatically. One book, category and book store is added.
You can start using all the endpoints directly.


### About Entities

There are 4 entities in this project: Book, BookStore, Category and CatalogRegistration. First three are self-explatory.
Catalog registration is the entity used for representing the ManyToMany relation between Book and BookStore. It can be
thought as book record in which you can find all the information about book and stores.

### About Book Prices
When you add a book to a bookstore, one of the parameters is relative price. Also every book has a price. Relative price is added to the base price and it gives the total price





