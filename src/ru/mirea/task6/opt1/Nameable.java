package ru.mirea.task6.opt1;

public interface Nameable {
    String getName();
}
class Planet implements Nameable{
    public String getName(){
        return "Mars";
    }
}
class Car implements Nameable{
    public String getName(){
        return "Nissan";
    }
}
class Furniture implements Nameable{
    public String getName(){
        return "Bed";
    }
}
class Test{
    public static void main(String[] args) {
        Planet p1 = new Planet();
        System.out.println(p1.getName());
        Car c1 = new Car();
        System.out.println(c1.getName());
        Furniture f1 = new Furniture();
        System.out.println(f1.getName());
    }
}
