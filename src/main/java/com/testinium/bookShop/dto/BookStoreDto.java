package com.testinium.bookShop.dto;

import java.util.List;

public class BookStoreDto {

    private int id;

    private String name;

    private String city;

    private List<CatalogRegistrationDto> catalogRegistrationDtos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<CatalogRegistrationDto> getCatalogRegistrationDtos() {
        return catalogRegistrationDtos;
    }

    public void setCatalogRegistrationDtos(List<CatalogRegistrationDto> catalogRegistrationDtos) {
        this.catalogRegistrationDtos = catalogRegistrationDtos;
    }

}
