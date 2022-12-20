package ru.courses.geometry;

class Square2 extends Figure {
    private double a;

    Square2(Point point, int a){
        super(point);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double square(){
        double s = Math.pow(a,2);
        return s;
    }
}