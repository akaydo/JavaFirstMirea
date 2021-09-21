package ru.mirea.task3.opt2;

public class TestHuman {
    public static void main(String[] args) {
        Human obj = new Human();
        String eyes = "green";
        System.out.println(obj);
        obj.setHeadEyes(eyes);
        System.out.println(obj);
        int length = 70;
        String size = "M";
        obj.setHand(length, size);
        System.out.println(obj);
    }
}
