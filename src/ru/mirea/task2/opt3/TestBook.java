package ru.mirea.task2.opt3;

public class TestBook {
    public static void main(String args[]) {
        Book b1 = new Book("Alexander","Pushkin","pushkin@mail.ru", 'M');
        Book b2 = new Book("Fedor","Dostoevskiy","fedosya@mail.ru", 'M');
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
