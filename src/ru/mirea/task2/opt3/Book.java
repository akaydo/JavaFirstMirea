package ru.mirea.task2.opt3;
import java.lang.*;
public class Book {
    private String name;
    private String surname;
    private String email;
    private char gender;

    public Book(String n, String s, String e, char g) {
        name = n;
        surname = s;
        email = e;
        gender = g;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return this.name+" "+this.surname+"("+this.gender+")"+" at "+this.email;
    }
}
