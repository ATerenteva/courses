package ru.courses.math;

public class Fraction {
    final int numerator;
    final int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator <= 0)
            throw new IllegalArgumentException("denominator must be positive");
        this.denominator = denominator;
    }

    public static Fraction sum(Fraction f, Fraction s) {
        int num;
        int den;

        if (f.denominator == s.denominator) {
            den = f.denominator;
            num = f.numerator + s.numerator;
            Fraction sum = new Fraction(num,den);
            return sum;
        }
        den = f.denominator * s.denominator;
        int multF = den / f.denominator,
                multS = den / s.denominator;
        num = f.numerator*multF + s.numerator*multS;
        Fraction sum = new Fraction(num,den);
        return sum;
    }

    public static Fraction sum(Fraction f, int a) {
        int num = a*a;
        int den = a;
        Fraction s = new Fraction(num,den);
        Fraction sum = sum(f,s);
        return sum;
    }

    public static Fraction minus(Fraction f, Fraction s) {
        int num;
        int den;
        if (f.denominator == s.denominator) {
            den = f.denominator;
            num = f.numerator - s.numerator;
            Fraction minus = new Fraction(num,den);
            return minus;
        }
        den = f.denominator * s.denominator;
        int multF = den / f.denominator,
                multS = den / s.denominator;
        num = f.numerator*multF - s.numerator*multS;
        Fraction minus = new Fraction(num,den);
        return minus;
    }

    public static Fraction minus(Fraction f, int a) {
        int num = a*a;
        int den = a;
        Fraction s = new Fraction(num,den);
        Fraction minus = minus(f,s);
        return minus;
    }

    public static Fraction mult(Fraction f, Fraction s) {
        int num = f.numerator * s.numerator;
        int den = f.denominator * s.denominator;
        Fraction mult = new Fraction(num, den);
        return mult;
    }

    public static Fraction mult(Fraction f, int a) {
        int num = a*a;
        int den = a;
        Fraction s = new Fraction(num,den);
        Fraction mult = mult(f,s);
        return mult;
    }

    public static Fraction div(Fraction f, Fraction s) {
        int num = f.numerator * s.denominator;
        int den = f.denominator * s.numerator;
        Fraction div = new Fraction(num, den);
        return div;
    }

    public static Fraction div(Fraction f, int a) {
        int num = a*a;
        int den = a;
        Fraction s = new Fraction(num,den);
        Fraction div = sum(f,s);
        return div;
    }

    @Override
    public String toString() {
        return numerator +
                "/" + denominator;
    }
}