package ru.courses.geometry;

class Circle extends Figure {
    private double rad;

    Circle(Point point, int rad){
        super(point);
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double square(){
        double s = Math.PI*Math.pow(rad,2);
        return s;
    }
}