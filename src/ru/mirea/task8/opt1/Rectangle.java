package ru.mirea.task8.opt1;
import java.awt.*;
public class Rectangle extends Shape {
    protected int width, height;

    public Rectangle(int x, int y, int width, int height,Color color) {
        this.color = color;
        this.point = new Point(x,y);
        this.width = width;
        this.height = height;
    };
    public double getX() {
        return point.getX();
    }

    public double getY() {
        return point.getY();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public  Color getColor() {
        return color;
    }


}
