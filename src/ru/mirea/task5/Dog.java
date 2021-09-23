package ru.mirea.task5;
import java.lang.*;

public abstract class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public abstract void Info();
}

class Samoyed extends Dog{
    private String standard;

    public Samoyed(int age, String name, String standard){
        super(age, name);
        this.standard = standard;
    }
    public void Info(){
        System.out.println("Кличка собаки: "+super.getName()+". Возраст собаки: "+super.getAge()+". Стандарт породы самоед: "+standard);
    }
}

class Spitz extends Dog{
    private String size;

    public Spitz(int age, String name, String size){
        super(age, name);
        this.size = size;
    }
    public void Info(){
        System.out.println("Кличка собаки: "+super.getName()+". Возраст собаки: "+super.getAge()+". Размер породы шпиц: "+size);
    }
}
