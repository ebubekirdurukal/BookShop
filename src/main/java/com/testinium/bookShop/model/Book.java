package com.testinium.bookShop.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    //There might be more than one book in a category

    @JsonIgnore
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<CatalogRegistration> catalogRegistrations = new ArrayList<>();

    //One book can be in morethan one bookstores.


    public Book(int id, String name, double price, Category category, List<CatalogRegistration> catalogRegistrations) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.catalogRegistrations = catalogRegistrations;
    }

    public Book() {
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<CatalogRegistration> getCatalogRegistrations() {
        return catalogRegistrations;
    }

    public void setCatalogRegistrations(List<CatalogRegistration> catalogRegistrations) {
        this.catalogRegistrations = catalogRegistrations;
    }
}
