package com.company.Models;

import java.time.Year;
import java.util.Objects;

import static java.lang.System.out;

public class Car {
    private String name;
    private String brand;
    private Year releaseYear;
    private double engineCapacity;

    {
        name = "";
        brand = "";
        releaseYear = Year.now();
        engineCapacity = 0.;
    }

    public Car() {
        this("");
    }

    public Car(String name) {
        this(name, "");
    }

    public Car(String name, String brand) {
        this(name, brand, Year.now());
    }

    public Car(String name, String brand, Year releaseYear) {
        this(name, brand, releaseYear, 0.);
    }

    public Car(String name, String brand, Year releaseYear, double engineCapacity) {
        this.name = name;
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 && Objects.equals(name, car.name) && Objects.equals(brand, car.brand) && Objects.equals(releaseYear, car.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, releaseYear, engineCapacity);
    }

    @Override
    public String toString() {
        return "-----------------------------------------------" +
                "\n|" + name + " (" + brand + ") " +
                "\n|releaseYear=" + releaseYear +
                "\n|engineCapacity=" + engineCapacity + " liters" +
                "\n-----------------------------------------------";
    }

    public void printCar() {
        out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
