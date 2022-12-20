package ru.courses.geometry;

import java.util.ArrayList;
import java.util.List;

class ClosedPolyLine extends Polyline{
    ClosedPolyLine(Point... pointList){
        super(pointList);
    }
    public List<Line> lineList(Polyline polyline) {
        List<Line> lineList = new ArrayList<>();
        for (int i = 0; i <= polyline.pointList.size()-1; i++) {
            if(i == polyline.pointList.size()-1) lineList.add(new Line(polyline.pointList.get(i), polyline.pointList.get(0)));
            else
                lineList.add(new Line(polyline.pointList.get(i), polyline.pointList.get(i+1)));
        }
        return lineList;
    }
}