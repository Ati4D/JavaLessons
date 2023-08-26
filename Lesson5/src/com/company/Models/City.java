package com.company.Models;


import java.util.Objects;

public class City {
    private String name;
    private String region;
    private String country;
    private long numberOfPeople;
    private int index;
    private short phoneCode;

    public City(String name, String region, String country) {
        this(name, region, country, 0L);
    }

    public City(String name, String region, String country, long numberOfPeople) {
        this(name, region, country, numberOfPeople, 0, (short) 0);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return numberOfPeople == city.numberOfPeople && index == city.index && phoneCode == city.phoneCode && Objects.equals(name, city.name) && Objects.equals(region, city.region) && Objects.equals(country, city.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, region, country, numberOfPeople, index, phoneCode);
    }

    @Override
    public String toString() {
        return "--------------------------------------------" +
                "\nName: " + this.name + " (" + this.country + "." + this.region + ")" +
                "\nNumber of people: " + this.numberOfPeople +
                "\nZip index: " + this.index +
                "\nPhone Code: " + this.phoneCode +
                "\n--------------------------------------------";
    }

    public void printCity() {
        System.out.println(this);
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

