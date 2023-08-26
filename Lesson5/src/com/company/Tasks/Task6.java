package com.company.Tasks;

import com.company.Models.Car;
import java.time.Year;

import static java.lang.System.out;

public class Task6 {
    public static void main(String[] args) {
        Car car1 = new Car("Lamborghini Aventador LP700-4",
                "Audi",
                Year.of(2011),
                6.5);
        Car car2 = new Car("Ferrari 488 GTB",
                "Fiat",
                Year.of(2015),
                3.9);

        car1.printCar();
        car2.printCar();

        out.println("car1 equals car2 == " + car1.equals(car2));
        out.println("car1.hashCode == car2.hashCode ==> " +
                car1.hashCode() + " == " + car2.hashCode() + " ==> " +
                (car1.hashCode() == car2.hashCode()));
    }
}
