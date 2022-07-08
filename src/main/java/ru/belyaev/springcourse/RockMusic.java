package ru.belyaev.springcourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Muter";
    }
}
