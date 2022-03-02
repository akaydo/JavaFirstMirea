package ru.mirea.sem2_task5;

public class Test2 {
    public static void main(String[] args) {
        Singleton2 firstInstance = Singleton2.getInstance();

        System.out.println(firstInstance.getClass());

        Singleton2 secondInstance = Singleton2.getInstance();

        System.out.println(firstInstance == secondInstance);
    }
}
