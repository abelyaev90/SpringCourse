package ru.belyaev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music{

    private List<String> songs = new ArrayList<>();

    {
        songs.add("colechko");
        songs.add("pesnya");
        songs.add("Chat");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }

}
