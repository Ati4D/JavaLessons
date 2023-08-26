package com.company.Models;

import java.time.Year;
import java.util.Objects;

import static java.lang.System.out;

public class Book {
    private String name;
    private String firstName;
    private String lastName;
    private Year releaseYear;
    private String publisherName;
    private String bookGenre;
    private int numOfPages;

    {
        name = "";
        firstName = "";
        lastName = "";
        releaseYear = Year.now();
        publisherName = "";
        bookGenre = "";
        numOfPages = 0;
    }

    public Book() {
        this("");
    }

    public Book(String name) {
        this(name, "", "", Year.now());
    }

    public Book(String name, String firstName, String lastName, Year releaseYear) {
        this(name, firstName, lastName, releaseYear, "");
    }

    public Book(String name, String firstName, String lastName, Year releaseYear, String publisherName) {
        this(name, firstName, lastName, releaseYear, publisherName, "");
    }

    public Book(String name, String firstName, String lastName, Year releaseYear, String publisherName, String bookGenre) {
        this(name, firstName, lastName, releaseYear, publisherName, bookGenre, 0);
    }

    public Book(String name, String firstName, String lastName, Year releaseYear, String publisherName, String bookGenre, int numOfPages) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.releaseYear = releaseYear;
        this.publisherName = publisherName;
        this.bookGenre = bookGenre;
        this.numOfPages = numOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numOfPages == book.numOfPages &&
                Objects.equals(name, book.name) &&
                Objects.equals(firstName, book.firstName) &&
                Objects.equals(lastName, book.lastName) &&
                Objects.equals(releaseYear, book.releaseYear) &&
                Objects.equals(publisherName, book.publisherName) &&
                Objects.equals(bookGenre, book.bookGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstName, lastName, releaseYear, publisherName, bookGenre, numOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "\nname='" + name + '\'' +
                "\nfirstName='" + firstName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\nreleaseYear=" + releaseYear +
                "\npublisherName='" + publisherName + '\'' +
                "\nbookGenre='" + bookGenre + '\'' +
                "\nnumOfPages=" + numOfPages +
                "\n}";
    }

    public void printBook() {
        out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        if (releaseYear.getValue() > Year.now().getValue()) {
            out.println("Error: incorrect year; Default year was setted!");
            this.releaseYear = Year.now();
        } else {
            this.releaseYear = releaseYear;
        }
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
