package com.company.Tasks;


import java.time.LocalDate;

public class City {
    String name;
    String region;
    String country;
    long numberOfPeople;
    int index;
    short phoneCode;

    public City(String name, String region, String country) {
        this(name, region, country, 0L);
    }

    public City(String name, String region, String country, long numberOfPeople) {
        this(name, region, country, numberOfPeople, 0, (short)0);
    }

    public City(String name, String region, String country, long numberOfPeople, int index, short phoneCode) {
        this.name = "";
        this.region = "";
        this.country = "";
        this.numberOfPeople = 0L;
        this.index = 0;
        this.phoneCode = 0;
        this.name = name;
        this.region = region;
        this.country = country;
        this.numberOfPeople = numberOfPeople;
        this.index = index;
        this.phoneCode = phoneCode;
    }

    public void printCity() {
        System.out.println("--------------------------------------------");
        System.out.println("Name: " + this.name + " (" + this.country + "." + this.region + ")");
        System.out.println("Number of people: " + this.numberOfPeople);
        System.out.println("Zip index: " + this.index);
        System.out.println("Phone Code: " + this.phoneCode);
        System.out.println("--------------------------------------------");
    }

    public String getName() {
        return this.name;
    }

    public String getRegion() {
        return this.region;
    }

    public String getCountry() {
        return this.country;
    }

    public long getNumberOfPeople() {
        return this.numberOfPeople;
    }

    public int getIndex() {
        return this.index;
    }

    public short getPhoneCode() {
        return this.phoneCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setPhoneCode(short phoneCode) {
        this.phoneCode = phoneCode;
    }
}

class Task2 {

    public static void main(String[] args) {
        City city = new City("Kovel", "Volyn", "Ukraine", 68240L, 45060, (short)3352);
        city.printCity();
    }
}