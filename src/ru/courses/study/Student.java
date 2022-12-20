package ru.courses.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    final private String name;
    private List<Integer> markList = new ArrayList<>();

    Student(String name, Integer... markList) {
        this.name = name;
        setMarkListPrivate(Arrays.asList(markList));
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarkList() {
        return markList;
    }

    private void setMarkListPrivate(List<Integer> markList) {
        for (int i = 0; i < markList.size(); i++) {
            if (markList.get(i) < 2 || markList.get(i) > 5) throw new IllegalArgumentException("marks must be 2 to 5");
        }
        this.markList.addAll(markList);
    }

    public void setMarkList(Integer... newMarkList) {
        setMarkListPrivate(Arrays.asList(newMarkList));
    }

    public String toString() {
        return name + ": " + markList;
    }

}