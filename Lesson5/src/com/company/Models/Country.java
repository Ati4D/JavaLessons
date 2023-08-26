package com.company.Models;

import java.util.Arrays;
import java.util.Objects;

public class Country {
    private String name;
    private String continent;
    private long numberOfPeople;
    private short phoneCode;
    private String capital;
    private String[] cities;

    public Country(String name, String continent) {
        this(name, continent, 0L, (short) 0);
    }

    public Country(String name, String continent, long numberOfPeople, short phoneCode) {
        this(name, continent, numberOfPeople, phoneCode, "", (String[]) null);
    }

    public Country(String name, String continent, long numberOfPeople, short phoneCode, String capital, String[] cities) {
        this.name = "";
        this.continent = "";
        this.numberOfPeople = 0L;
        this.phoneCode = 0;
        this.capital = "";
        this.cities = null;
        this.name = name;
        this.continent = continent;
        this.numberOfPeople = numberOfPeople;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return numberOfPeople == country.numberOfPeople && phoneCode == country.phoneCode && Objects.equals(name, country.name) && Objects.equals(continent, country.continent) && Objects.equals(capital, country.capital) && Arrays.equals(cities, country.cities);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, continent, numberOfPeople, phoneCode, capital);
        result = 31 * result + Arrays.hashCode(cities);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder countryBuilder = new StringBuilder(
                "--------------------------------------------" +
                        "\nName: " + this.name + " (" + this.continent + ") " +
                        "\nNumber of people: " + this.numberOfPeople +
                        "\nPhone Code: +" + this.phoneCode +
                        "\nCapital: " + this.capital +
                        "\nCities: ");
        if (this.cities != null) {
            int i = 0;
            int var3 = this.cities.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                if (i == 4) {
                    countryBuilder.append("\n");
                    i = 0;
                }
                ++i;
                countryBuilder.append(this.cities[var4] + "; ");
            }
        } else {
            countryBuilder.append("\nNo cities");
        }
        countryBuilder.append("\n--------------------------------------------");
        return countryBuilder.toString();
    }

    public void printCountry() {
        System.out.println(this);
    }

    public String getName() {
        return this.name;
    }

    public String getContinent() {
        return this.continent;
    }

    public long getNumberOfPeople() {
        return this.numberOfPeople;
    }

    public short getPhoneCode() {
        return this.phoneCode;
    }

    public String getCapital() {
        return this.capital;
    }

    public String[] getCities() {
        return this.cities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setPhoneCode(short phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
}
