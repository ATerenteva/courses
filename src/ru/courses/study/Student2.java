package ru.courses.study;

import java.util.ArrayList;
import java.util.List;

public final class Student2{
    private List grades=new ArrayList<>();
    String name;
    private Rule rule;

    public Student2(String name, Rule rule) {
        this.name = name;
        this.rule = rule;
    }
    public void addGrade(int x){
        if(rule.check(x)) grades.add(x);
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public String toString() {
        return "Student{" + " grades =" + grades + ", name=" + name + '}';
    }
}