package com.company.Tasks;

import com.company.Models.Person;

import java.time.LocalDate;

public class Task1 {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2002, 3, 20);
        Person man = new Person("John", "Adams", birthday, "+380663984567");
        man.printPerson();
        man.setCity("Lviv");
        man.setCountry("Ukraine");
        man.setAddress("Bandery 22");
        man.printPerson();
    }
}
