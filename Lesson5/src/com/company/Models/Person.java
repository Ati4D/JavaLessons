package com.company.Models;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String phone;
    private String city;
    private String country;
    private String address;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthday, person.birthday) &&
                Objects.equals(phone, person.phone) &&
                Objects.equals(city, person.city) &&
                Objects.equals(country, person.country) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthday, phone, city, country, address);
    }

    @Override
    public String toString() {
        return "--------------------------------------------" +
                "\nName: " + this.firstName + " " + this.lastName +
                "\nBirthday: " + this.birthday.toString() +
                "\nPhone: " + this.phone +
                "\nCity: " + this.city + " (" + this.country + ")" +
                "\nAddress: " + this.address +
                "\n--------------------------------------------";
    }

    public void printPerson() {
        System.out.println(this);
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
