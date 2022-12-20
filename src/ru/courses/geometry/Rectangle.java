package ru.courses.geometry;

class Rectangle extends Figure {
    private double a;
    private double b;

    Rectangle(Point point, int a, int b){
        super(point);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double square(){
        double s = a*b;
        return s;
    }
}