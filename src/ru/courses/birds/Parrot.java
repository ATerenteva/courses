package ru.courses.birds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Parrot extends Bird {
    String song;

    Parrot(String song) {
        this.song = song;
    }

    @Override
    void printSong() {
        List<Character> charList = new ArrayList<Character>();

        for (char c : song.toCharArray()) {
            charList.add(c);
        }
        Collections.shuffle(charList);
        String str = charList.stream()
                .map(e -> e.toString())
                .collect(Collectors.joining());
        System.out.println(str);
    }

}