package ru.courses.geometry;
import ru.courses.*;

public class Line implements Start.Lenghtable {
    Point pointBegin;
    Point pointEnd;

    Line(Point pointBegin, Point pointEnd){
        this.pointBegin = pointBegin;
        this.pointEnd = pointEnd;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public String toString() {
        return "Линия от " + pointBegin +
                " до " + pointEnd;
    }

    public static double lenght(Line line) {
        double lenght = Math.sqrt(Math.pow((line.pointEnd.x - line.pointBegin.x),2) + Math.pow((line.pointEnd.y - line.pointBegin.y),2));
        return lenght;
    }

    @Override
    public double length() {
        return lenght(this);
    }
}