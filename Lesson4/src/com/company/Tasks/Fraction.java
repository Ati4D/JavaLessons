package com.company.Tasks;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator) throws Exception {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) throws Exception {
        this.numerator = 1;
        this.denominator = 1;

        try {
            this.numerator = numerator;
            this.setDenominator(denominator);
            this.round();
        } catch (Exception var4) {
            throw var4;
        }
    }

    public String toString() {
        return "(" + this.numerator + "/" + this.denominator + ")";
    }

    public static Fraction sum(Fraction firstFraction, Fraction secondFraction) throws Exception {
        try {
            int resultNumerator = firstFraction.numerator * secondFraction.denominator + secondFraction.numerator * firstFraction.denominator;
            int resultDenominator = firstFraction.denominator * secondFraction.denominator;
            return new Fraction(resultNumerator, resultDenominator);
        } catch (Exception var5) {
            throw var5;
        }
    }

    public static Fraction subtract(Fraction firstFraction, Fraction secondFraction) throws Exception {
        try {
            int resultNumerator = firstFraction.numerator * secondFraction.denominator - secondFraction.numerator * firstFraction.denominator;
            int resultDenominator = firstFraction.denominator * secondFraction.denominator;
            return new Fraction(resultNumerator, resultDenominator);
        } catch (Exception var5) {
            throw var5;
        }
    }

    public static Fraction multiply(Fraction firstFraction, Fraction secondFraction) throws Exception {
        try {
            int resultNumerator = firstFraction.numerator * secondFraction.numerator;
            int resultDenominator = firstFraction.denominator * secondFraction.denominator;
            return new Fraction(resultNumerator, resultDenominator);
        } catch (Exception var5) {
            throw var5;
        }
    }

    public static Fraction divide(Fraction firstFraction, Fraction secondFraction) throws Exception {
        try {
            secondFraction.overTurn();
            int resultNumerator = firstFraction.numerator * secondFraction.numerator;
            int resultDenominator = firstFraction.denominator * secondFraction.denominator;
            return new Fraction(resultNumerator, resultDenominator);
        } catch (Exception var5) {
            throw var5;
        }
    }

    private void overTurn() throws Exception {
        try {
            int temp = this.numerator;
            this.numerator = this.denominator;
            this.setDenominator(temp);
        } catch (Exception var2) {
            throw var2;
        }
    }

    public void round() {
        int[] dividers = new int[]{5, 3, 2};
        int[] var2 = dividers;
        int var3 = dividers.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            for(int it = var2[var4]; this.numerator % it == 0 && this.denominator % it == 0 && this.numerator != 0 && this.denominator != 0; this.denominator /= it) {
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

    public void setDenominator(int denominator) throws Exception {
        if (denominator == 0) {
            throw new Exception("Error: DivideByZero");
        } else {
            this.denominator = denominator;
            this.round();
        }
    }
}
class Task4 {
    public static void main(String[] args) {
        System.out.println("\nTest1");

        Fraction e2;
        Fraction e3;
        try {
            e2 = new Fraction(4, 45);
            e3 = new Fraction(41, 8);
            System.out.println(Fraction.sum(e2, e3));
            System.out.println(Fraction.subtract(e2, e3));
            System.out.println(Fraction.multiply(e2, e3));
            System.out.println(Fraction.divide(e2, e3));
        } catch (Exception var6) {
            System.out.println(var6.getMessage());
        }

        System.out.println("\nTest1");

        try {
            e2 = new Fraction(5, 0);
            System.out.println("e1 = " + e2);
        } catch (Exception var5) {
            System.out.println(var5.getMessage());
        }

        System.out.println("\nTest1");

        try {
            e2 = new Fraction(0, 5);
            System.out.println("e2 = " + e2);
            e3 = new Fraction(3, 7);
            System.out.println("e3 = " + e3);
            Fraction divided = Fraction.divide(e3, e2);
            System.out.println(divided);
        } catch (Exception var4) {
            System.out.println(var4.getMessage());
        }

    }
}