package com.company.Tasks;

import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthday;
    String phone;
    String city;
    String country;
    String address;

    public Person(String firstName, String lastName, LocalDate birthday, String phone) {
        this(firstName, lastName, birthday, phone, "", "");
    }

    public Person(String firstName, String lastName, LocalDate birthday, String phone, String city, String country) {
        this(firstName, lastName, birthday, phone, city, country, "");
    }

    public Person(String firstName, String lastName, LocalDate birthday, String phone, String city, String country, String address) {
        this.firstName = "";
        this.lastName = "";
        this.birthday = LocalDate.now();
        this.phone = "";
        this.city = "";
        this.country = "";
        this.address = "";
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void printPerson() {
        System.out.println("--------------------------------------------");
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Birthday: " + this.birthday.toString());
        System.out.println("Phone: " + this.phone);
        System.out.println("City: " + this.city + " (" + this.country + ")");
        System.out.println("Address: " + this.address);
        System.out.println("--------------------------------------------");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getAddress() {
        return this.address;
    }
}
class Task1 {

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
