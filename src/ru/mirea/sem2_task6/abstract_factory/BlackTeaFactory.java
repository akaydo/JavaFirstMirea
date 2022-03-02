package ru.mirea.sem2_task6.abstract_factory;

public class BlackTeaFactory implements TeaFactory{
    @Override
    public IndianTea createIndianTea() {
        return new BlackIndianTea();
    }

    @Override
    public TurkishTea createTurkishTea() {
        return new BlackTurkishTea();
    }
}