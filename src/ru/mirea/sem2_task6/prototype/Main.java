package ru.mirea.sem2_task6.prototype;

public class Main {
    public static void main(String[] args) {
        Project project = new Project(22234569,"Kristina", "Feklistova");
        Project copy = project.copy();
        System.out.println(copy);
    }
}
