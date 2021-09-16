package ru.mirea.task2.opt1;
import java.lang.*;
public class Shape {
    private String color;
    private String kind;
    private int height;

        public Shape(String c, String k, int h) {
            color = c;
            kind = k;
            height = h;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getColor() {
            return color;
        }

        public String getKind() {
            return kind;
        }

        public int getHeight() {
            return height;
        }


        public String toString() {
            return this.kind+" is "+this.color+" and "+this.height+" cm";
        }
    }

