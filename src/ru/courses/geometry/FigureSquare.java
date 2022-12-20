package ru.courses.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FigureSquare {
    public static void squares(Figure... figures) {
        List<Figure> figureList = new ArrayList(Arrays.asList(figures));
        double sum = 0;
        for (Figure figure : figureList) {
            sum += figure.square();
        }
        System.out.println(sum);
    }
}