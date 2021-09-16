package ru.mirea.task2.opt2;
import java.lang.*;
public class Ball1 {
    private String color;
    private String kind;
    private int radius;

    public Ball1(String c, String k, int r) {
       color = c;
       radius = r;
       kind = k;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String toString() {
        return this.kind+" ball is "+this.color+" and "+this.radius+" cm";
    }
}
