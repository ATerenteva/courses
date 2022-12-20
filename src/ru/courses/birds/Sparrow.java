package ru.courses.birds;

class Sparrow extends Bird {
    final String song = "чырык";

    @Override
    void printSong() {
        System.out.println(song);
    }

}