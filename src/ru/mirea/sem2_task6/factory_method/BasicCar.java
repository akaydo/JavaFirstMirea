package ru.mirea.sem2_task6.factory_method;

class BasicCar extends Car{
    public BasicCar(){
        name = "Basic Car";
        accessories.add("Basic salon");
        accessories.add("Air condition");
    }
}
