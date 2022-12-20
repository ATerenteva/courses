package ru.courses;

import ru.courses.geometry.*;
import ru.courses.birds.*;
import ru.courses.company.*;
import ru.courses.math.*;
import ru.courses.study.*;
import ru.courses.travel.*;

public class Start {
    public static void main(String[] args) {
        Property color = new Property("цвет", "жёлтый");
        Property coordinate = new Property("координата x", 3);
        Property time = new Property("время", "15:35");

        HardPoint point = new HardPoint(color, coordinate, time);
        System.out.println(point);

        Student2 student2 = new Student2("Вася", x->x<6);
        student2.addGrade(2);
        student2.addGrade(7);
        System.out.println(student2.getGrades());
    }

    public interface Fractable {
        public static float sum(Float... f) {
            return 0;
        }
    }

   public interface Lenghtable {
        public double length();
    }

    public interface Birdable {
        public static void printSongs(Bird... bird) {
            BirdsSongs.printSongs(bird);
        }
    }

    public interface Squarable{
        public static void squares(Figure... figures){
            FigureSquare.squares(figures);
        }
    }
}