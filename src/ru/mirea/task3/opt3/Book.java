package ru.mirea.task3.opt3;

public class Book {
    private String name;
    private String surname;
    private String title;
    private int year;

    public Book(String n, String s, String t, int y) {
        name = n;
        surname = s;
        title = t;
        year = y;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String toString() {
        return "The book "+"'"+this.title+"'"+" was written by "+this.name+" "+this.surname+" in "+this.year;
    }
}
