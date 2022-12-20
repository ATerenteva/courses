package ru.courses.birds;

class Cuckoo extends Bird {
    final String song = "ку-ку ";

    @Override
    public void printSong() {
        int max = 10;
        System.out.println(song.repeat((int) (Math.random() * ++max)));
    }

}