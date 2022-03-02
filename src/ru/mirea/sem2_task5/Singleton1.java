package ru.mirea.sem2_task5;
// https://vertex-academy.com/tutorials/ru/pattern-singleton-realizacii/
public class Singleton1 {
    // приватный конструктор не позволяет создавать новый экземпляр класса
    private Singleton1() {
        System.out.println("Singleton created!");
    }
    // создание объекта
    public static final Singleton1 INSTANCE = new Singleton1();

    public void printName() {
        System.out.println("I am a Singleton!");
    }
}
