package ru.mirea.task28;

public class Car {
    String model;
    int price;
    int year;
    Type type;

    public Car(Type type, String model, int year, int price) {
        this.type = type;
        this.price = price;
        this.year = year;
        this.model = model;
    }

    public void data() { System.out.println("Автомобиль: " + model + " " + type.type + " " + type.speed + " км/ч " + year + " " + price); }

    private static class Type {
        String type;
        int speed;

        public Type(String type, int speed) {
            this.speed = speed;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Car mazda = new Car(new Type("Sedan", 200), "Mazda", 2019, 6000000);
        mazda.data();

        Car mercedes = new Car(new Type("Hatchback", 180), "Mercedes", 2013, 5000000) {
            public void data() { System.out.println("Автомобиль -> " + model + " " + type.type + " " + type.speed + " км/ч " + year + " " + price); }
        };

        System.out.println();
        mercedes.data();
    }
}