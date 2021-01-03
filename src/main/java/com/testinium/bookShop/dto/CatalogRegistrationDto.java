package com.testinium.bookShop.dto;


public class CatalogRegistrationDto {

    private int id;

    private BookDto bookDto;

    private int bookId;

    private int bookStoreId;

    private BookStoreDto bookStoreDto;

    private double relativePrice;

    public CatalogRegistrationDto(int id, BookDto bookDto, int bookId, int bookStoreId, BookStoreDto bookStoreDto, double relativePrice) {
        this.id = id;
        this.bookDto = bookDto;
        this.bookId = bookId;
        this.bookStoreId = bookStoreId;
        this.bookStoreDto = bookStoreDto;
        this.relativePrice = relativePrice;
    }

    public CatalogRegistrationDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookDto getBookDto() {
        return bookDto;
    }

    public void setBookDto(BookDto bookDto) {
        this.bookDto = bookDto;
    }

    public BookStoreDto getBookStoreDto() {
        return bookStoreDto;
    }

    public void setBookStoreDto(BookStoreDto bookStoreDto) {
        this.bookStoreDto = bookStoreDto;
    }

    public double getRelativePrice() {
        return relativePrice;
    }

    public void setRelativePrice(double relativePrice) {
        this.relativePrice = relativePrice;
    }


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookStoreId() {
        return bookStoreId;
    }

    public void setBookStoreId(int bookStoreId) {
        this.bookStoreId = bookStoreId;
    }
}
