package ru.mirea.task7.opt2_3_4;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {}

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ",length: " + this.length + ", color: " + this.color;
    }
}
