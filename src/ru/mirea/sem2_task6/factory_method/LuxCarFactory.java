package ru.mirea.sem2_task6.factory_method;

class LuxCarFactory extends CarFactory{
    public Car createCar(){
        return new LuxCar();
    }
}
