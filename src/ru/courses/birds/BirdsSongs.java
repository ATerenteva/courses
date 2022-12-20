package ru.courses.birds;
import ru.courses.main.Start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirdsSongs implements Start.Birdable {

    public static void printSongs(Bird... birds) {
        List<Bird> birdList = new ArrayList(Arrays.asList(birds));
        for (Bird bird : birdList) {
            bird.printSong();
        }
    }
}