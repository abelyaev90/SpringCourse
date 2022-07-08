package ru.belyaev.springcourse;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void initMethod() {
        System.out.println("Work init");
    }

    public void destroyMethod() {
        System.out.println("Work Destroy");
    }
    @Override
    public String getSong() {
         return "Rapsody";
    }
}
