package ru.courses.geometry;

abstract public class Figure{
    private Point point;
    Figure(Point point){
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    abstract double square();
}
