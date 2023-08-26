package com.company.Models;

import com.company.CastomExceptions.DivideByZeroException;

import java.util.Objects;

import static java.lang.System.out;

public class Fraction {
    private int numerator;
    private int denominator;

    {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction() {
        this(1);
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        try {
            this.numerator = numerator;
            this.setDenominator(denominator);
            this.round();
        } catch (DivideByZeroException e) {
            out.println(e.getMessage() + ",\tDefault Fraction was created!");
            this.numerator = 1;
            this.denominator = 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "(" + this.numerator + "/" + this.denominator + ")";
    }

    public static Fraction sum(Fraction firstFraction, Fraction secondFraction) {
        int resultNumerator = firstFraction.numerator * secondFraction.denominator + secondFraction.numerator * firstFraction.denominator;
        int resultDenominator = firstFraction.denominator * secondFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public static Fraction subtract(Fraction firstFraction, Fraction secondFraction) {
        int resultNumerator = firstFraction.numerator * secondFraction.denominator - secondFraction.numerator * firstFraction.denominator;
        int resultDenominator = firstFraction.denominator * secondFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public static Fraction multiply(Fraction firstFraction, Fraction secondFraction) {
        int resultNumerator = firstFraction.numerator * secondFraction.numerator;
        int resultDenominator = firstFraction.denominator * secondFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public static Fraction divide(Fraction firstFraction, Fraction secondFraction) {
        try {
            secondFraction.overTurn();
        } catch (DivideByZeroException e) {
            out.println(e.getMessage() + ",\tDefault Fraction was returned!");
            return new Fraction();
        }
        int resultNumerator = firstFraction.numerator * secondFraction.numerator;
        int resultDenominator = firstFraction.denominator * secondFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    private void overTurn() throws DivideByZeroException {
        if (this.numerator == 0) {
            throw new DivideByZeroException();
        }
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    public void round() {
        int[] dividers = new int[]{5, 3, 2};
        int[] var2 = dividers;
        int var3 = dividers.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            for (int it = var2[var4]; this.numerator % it == 0 && this.denominator % it == 0 && this.numerator != 0 && this.denominator != 0; this.denominator /= it) {
                this.numerator /= it;
            }
        }

    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        this.round();
    }

    public void setDenominator(int denominator) throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException();
        } else {
            this.denominator = denominator;
            this.round();
        }
    }
}
