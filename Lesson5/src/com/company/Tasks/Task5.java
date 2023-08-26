package com.company.Tasks;

import com.company.Models.Book;
import java.time.Year;

import static java.lang.System.out;

public class Task5 {
    public static void main(String[] args) {
        Book book1 = new Book("The Adventures of Tom Sawyer",
                "Mark",
                "Twain",
                Year.of(1876),
                "American Publishing Company",
                "Novel",
                274);
        Book book2 = new Book("The Adventures of Huckleberry Finn",
                "Mark",
                "Twain",
                Year.of(1884),
                "Charles L. Webster And Company.",
                "Novel",
                362);

        book1.printBook();
        book2.printBook();

        out.println("book1 equals book2 == " + book1.equals(book2));
        out.println("book1.hashCode == book2.hashCode ==> " +
                book1.hashCode() + " == " + book2.hashCode() + " ==> " +
                (book1.hashCode() == book2.hashCode()));
    }
}
