package ru.belyaev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private final ClassicalMusic classicalMusic;
    private final RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();
        int randomSong = random.nextInt(3);

        if (genre == Genre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomSong));
        } else {
            System.out.println(rockMusic.getSongs().get(randomSong));
        }
    }
}

