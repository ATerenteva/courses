package ru.courses.geometry;
import ru.courses.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Polyline implements Start.Lenghtable {
    List<Point> pointList;
    Polyline(Point... pointList) {
        this.pointList = new ArrayList(Arrays.asList(pointList));
    }
    @Override
    public String toString() {
        return "Линия" + pointList;
    }
    public List<Line> lineList(Polyline polyline) {
        List<Line> lineList = new ArrayList<>();
        for (int i = 0; i < polyline.pointList.size()-1; i++) {
            lineList.add(new Line(polyline.pointList.get(i), polyline.pointList.get(i+1)));
        }
        return lineList;
    }
    public static double polyLenght(Polyline polyline){
        double sum = 0;
        for (int i = 0; i < polyline.lineList(polyline).size(); i++) {
            sum += Line.lenght(polyline.lineList(polyline).get(i));
        }
        return sum;
    }

    @Override
    public double length() {
        return polyLenght(this);
    }
}