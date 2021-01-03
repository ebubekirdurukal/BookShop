From openjdk:8
copy ./target/BookShop-1.0.jar BookShop-1.0.jar
CMD ["java","-jar","BookShop-1.0.jar"]