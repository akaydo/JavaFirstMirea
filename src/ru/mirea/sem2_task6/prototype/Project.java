package ru.mirea.sem2_task6.prototype;

public class Project implements Copy {
    private int id;
    private String firstName;
    private String lastName;

    public Project(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Project copy() {
        return new Project(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return id + ", " + firstName + " " + lastName;
    }
}

