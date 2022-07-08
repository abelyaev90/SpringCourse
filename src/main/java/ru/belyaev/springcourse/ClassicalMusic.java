package ru.belyaev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса

    {
        songs.add("Rapsody");
        songs.add("Symphony");
        songs.add("Shelcunchick");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}
