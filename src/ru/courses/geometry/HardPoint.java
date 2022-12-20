package ru.courses.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HardPoint {
    List<Property> propertiesList;

    public HardPoint(Property... propertiesList){
        this.propertiesList = new ArrayList(Arrays.asList(propertiesList));
    }

    @Override
    public String toString() {
        return "Точка" + propertiesList;
    }
}
