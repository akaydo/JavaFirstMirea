package ru.mirea.task2.opt4;
import java.lang.*;
public class TestDog {
    public static void main (String[] args) {
        Dog d1 = new Dog("Sharik", 3);
        Dog d2 = new Dog("Spotik", 7);
        Dog d3 = new Dog("Vasya");
        d3.setAge(2);
        System.out.println(d3.getName());
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
