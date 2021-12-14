package ru.mirea.task32;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString() {
        return "MovableCircle, x:" + x + ", y:" + y + ", xSpeed:" + xSpeed + ", ySpeed:" + ySpeed + ", radius:" + radius;
    }
    public void moveUp() {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveRight() {
        center.moveRight();
    }
    public void moveLeft() {
        center.moveLeft();
    }
}
