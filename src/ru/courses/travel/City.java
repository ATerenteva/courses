package ru.courses.travel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class City {
    String name;
    List<Route> routeList;

    City(String name, Route... routeList) {
        this.name = name;
        this.routeList = new ArrayList(Arrays.asList(routeList));
    }

    public void addRoute(Route route) {
        this.routeList.add(route);
    }

    public void addRoute(City city, int price) {
        this.routeList.add(new Route(city, price));
    }

    @Override
    public String toString() {
        return "Название: " + name +
                ", Путь: " + routeList;
    }

    public static City goTravel (int n, City city){
        City cityVar = city;
        int i = 1;
        if (n<1) return cityVar;
        do {
            if (city.routeList.get(1).city ==null) return null;
            city = city.routeList.get(1).city;
            goTravel(i-1, cityVar);
            i++;
        } while (i<n+1);
        return city;
    }
}
