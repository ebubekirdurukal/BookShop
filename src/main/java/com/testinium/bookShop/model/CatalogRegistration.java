package com.testinium.bookShop.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "catalog_registration")
public class CatalogRegistration {

    /*
    This entity is used to demonstrate manyToMany relation between Book and BookStore entities.
    It can be thought as a catalog record for books.
    It joins book and bookStore columns using manyToOne relationship.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "book")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "book_store")
    @JsonIgnore
    private BookStore bookStore;

    @Column
    private double relativePrice;

    public CatalogRegistration(int id, Book book, BookStore bookStore, double relativePrice) {
        this.id = id;
        this.book = book;
        this.bookStore = bookStore;
        this.relativePrice = relativePrice;
    }

    public CatalogRegistration() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookStore getBookStore() {
        return bookStore;
    }

    public void setBookStore(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    public double getRelativePrice() {
        return relativePrice;
    }

    public void setRelativePrice(double relativePrice) {
        this.relativePrice = relativePrice;
    }
}


