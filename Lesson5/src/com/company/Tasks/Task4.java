package com.company.Tasks;

import com.company.Models.Fraction;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("\nTest1");
        Fraction e2;
        Fraction e3;
        e2 = new Fraction(4, 45);
        e3 = new Fraction(41, 8);
        System.out.println(e2 + " + " + e3 + " = " + Fraction.sum(e2, e3));
        System.out.println(e2 + " - " + e3 + " = " + Fraction.subtract(e2, e3));
        System.out.println(e2 + " * " + e3 + " = " + Fraction.multiply(e2, e3));
        System.out.println(e2 + " / " + e3 + " = " + Fraction.divide(e2, e3));


        System.out.println("\nTest2\ne2 => (5/0)");
        e2 = new Fraction(5, 0);
        System.out.println("e2 = " + e2);

        System.out.println("\nTest3");
        e2 = new Fraction(3, 7);
        System.out.println("e2 = " + e2);
        e3 = new Fraction(0, 5);
        System.out.println("e3 = " + e3);
        System.out.println(e2 + " / " + e3 + " = " + Fraction.divide(e2, e3));
    }
}
