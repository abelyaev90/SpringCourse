package ru.belyaev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), popMusic());
    }
    @Bean MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean Computer computer() {
        return new Computer(musicPlayer());
    }
}
