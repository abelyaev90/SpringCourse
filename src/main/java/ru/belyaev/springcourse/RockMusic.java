package ru.belyaev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("muter");
        songs.add("Links");
        songs.add("House");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
