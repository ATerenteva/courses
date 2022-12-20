package ru.courses.travel;

public class Route {
    City city;
    int price;

    Route(City city, int price){
        this.city = city;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название города: "+ city.name +
                ", Стоимость=" + price;
    }
}
