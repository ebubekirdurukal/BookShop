package com.testinium.bookShop.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "book_store")
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String city;

    @OneToMany(mappedBy = "bookStore", cascade = CascadeType.ALL)
    private List<CatalogRegistration> catalogRegistrations;


    public BookStore(int id, String name, String city, List<CatalogRegistration> catalogRegistrations) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.catalogRegistrations = catalogRegistrations;
    }

    public BookStore() {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public List<CatalogRegistration> getCatalogRegistrations() {
        return catalogRegistrations;
    }

    public void setCatalogRegistrations(List<CatalogRegistration> catalogRegistrations) {
        this.catalogRegistrations = catalogRegistrations;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", catalogRegistrations=" + catalogRegistrations +
                '}';
    }
}
