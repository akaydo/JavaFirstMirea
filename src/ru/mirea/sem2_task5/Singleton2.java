package ru.mirea.sem2_task5;

public class Singleton2 {
    // instance будет создаваться по вызову
    private static Singleton2 instance;

    private Singleton2() {
        System.out.println("Singleton created!");
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
