package ru.mirea.sem2_task6.factory_method;

class BasicCarFactory extends CarFactory{
    public Car createCar(){
        return new BasicCar();
    }
}