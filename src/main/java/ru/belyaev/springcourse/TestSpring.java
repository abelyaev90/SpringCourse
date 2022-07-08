package ru.belyaev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

/*        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.setVolume(5);
        musicPlayer1.playMusic();
        System.out.println();
        musicPlayer2.playMusic();
        System.out.println(musicPlayer1.getName() + " " + musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getName() + " " + musicPlayer2.getVolume());*/
        Music music = context.getBean("musicBeanClassical", Music.class);
        Music music1 = context.getBean("musicBeanClassical", Music.class);
        Music music2 = context.getBean("musicBeanClassical", Music.class);
        System.out.println(music == music1);
        System.out.println( music.getSong());
        System.out.println( music1.getSong());
        System.out.println( music2.getSong());
        context.close();
    }
}
