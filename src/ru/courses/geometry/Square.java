package ru.courses.geometry;

public class Square {
    private Point point;
    private int n;

    public Square(Point point, int n) {
        this.point = point;
        setNPrivate(n);
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        setNPrivate(n);
    }

    private void setNPrivate(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be >0");
        this.n = n;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + point +
                " со стороной " + n;
    }
}