package ru.mirea.task30;

import java.util.ArrayList;

public class Woman {
    public String name;
    private int weight;
    private String eyesColor;
    private String hairColor;
    private int age;

    public Woman(String name, int weight, String eyesColor, String hairColor, int age) {
        this.name = name;
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Woman: " + "name=" + name + "; " +
                "weight=" + weight + "; " +
                "eyesColor=" + eyesColor + "; " +
                "hairColor=" + hairColor + "; " +
                "age=" + age +
                '.';
    }

    @Override
    public int hashCode() {
        return weight + 31 * eyesColor.hashCode() + 31 * hairColor.hashCode() + age;
    }
}