package ru.courses.math;

import ru.courses.main.Start;

class Fraction1 extends Number implements Start.Fractable{
    int num,denum;

    public Fraction1(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }

    @Override
    public int intValue() {
        return num/denum;
    }

    @Override
    public long longValue() {
        return num/denum;
    }

    @Override
    public float floatValue() {
        return (float)num/denum;
    }

    @Override
    public double doubleValue() {
        return (double) num/denum;
    }

    public static float sum(Float... f){
        float sum = 0;
        for(int i = 0; i<f.length; i++){
            sum+=f[i];
        }
        return sum;
    }
}
