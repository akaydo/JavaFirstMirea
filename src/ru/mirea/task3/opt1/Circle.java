package ru.mirea.task3.opt1;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle(double r, String c, boolean f){
        radius = r;
        color = c;
        filled = f;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean getFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color+", filled: "+this.filled;
    }
}

