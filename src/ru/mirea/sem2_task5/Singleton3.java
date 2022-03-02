package ru.mirea.sem2_task5;
// конструктор Enum приватный по умолчанию
public enum Singleton3 {
        INSTANCE;

    private Singleton3() {
        System.out.println("Singleton created!");
    }
}
