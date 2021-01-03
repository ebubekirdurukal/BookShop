package com.testinium.bookShop.dto;


import java.util.List;

public class BookDto {

    private int id;

    private String name;

    private Double price;

    private int categoryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private List<CatalogRegistrationDto> catalogRegistrationDtos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public List<CatalogRegistrationDto> getCatalogRegistrationDtos() {
        return catalogRegistrationDtos;
    }

    public void setCatalogRegistrationDtos(List<CatalogRegistrationDto> catalogRegistrationDtos) {
        this.catalogRegistrationDtos = catalogRegistrationDtos;
    }


}

