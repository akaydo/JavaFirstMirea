package ru.mirea.sem2_task5;

public class Test1 {
    public static void main(String[] args) {

        Singleton1.INSTANCE.printName();

        System.out.println(Singleton1.INSTANCE.getClass());
    }
}
