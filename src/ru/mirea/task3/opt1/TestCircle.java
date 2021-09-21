package ru.mirea.task3.opt1;

public class TestCircle {
    public static void main(String args[]) {
        Circle c1 = new Circle(2,"blue", false);
        Circle c2 = new Circle(3, "green", true);
        Circle c3 = new Circle(4, "pink", true);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3);

    }
}
