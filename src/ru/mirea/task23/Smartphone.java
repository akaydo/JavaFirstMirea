package ru.mirea.task23;

public class Smartphone {
    private int year = 0;
    private String mark = "";
    private String model ="";
    public Smartphone(int year, String mark, String model){
        this.year = year;
        this.mark = mark;
        this.model = model;
    }
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args){
        Smartphone smart1 = new Smartphone(2016, "Xiaomi", "Mi Max");
        Smartphone smart2 = new Smartphone(2021, "Samsung", "Galaxy A22");
        Smartphone smart3 = new Smartphone(2017, "iPhone", "X");
        Smartphone smart4 = new Smartphone(2021, "Sony", "Xperia 1");
        Smartphone smart5 = new Smartphone(2018, "Xiaomi", "Redmi Note 6 Pro");
        //сравнение объектов
        if(smart1.hashCode()==smart1.hashCode()) {
            System.out.println("Смартфон " + smart1.mark + " " + smart1.model + " равен смартфону " + smart5.mark + " " + smart5.model);
        }
        else System.out.println("Смартфон " + smart1.mark + " " + smart1.model + " НЕ равен смартфону " + smart5.mark + " " + smart5.model);
        System.out.println("Хеш-код Смартфона " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код Смартфона " + smart5.mark + " " + smart5.model+  ": " + smart5.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart2.hashCode()) {
            System.out.println("Смартфон " + smart1.mark + " " + smart1.model + " равен Смартфону " + smart2.mark + " " + smart2.model);
        }
        else System.out.println("Автомобиль " + smart1.mark + " " + smart1.model + " НЕ равен Автомобилю " + smart2.mark + " " + smart2.model);
        System.out.println("Хеш-код Смартфону " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код Смартфона " + smart2.mark + " " + smart2.model+  ": " + smart2.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart3.hashCode()) {
            System.out.println("Смартфон " + smart1.mark + " " + smart1.model + " равен смартфону " + smart3.mark + " " + smart3.model);
        }
        else System.out.println("Смартфон " + smart1.mark + " " + smart1.model + " НЕ равен смартфону " + smart3.mark + " " + smart3.model);
        System.out.println("Хеш-код смартфона " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код смартфона " + smart3.mark + " " + smart3.model+  ": " + smart3.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart4.hashCode()) {
            System.out.println("Смартфон " + smart1.mark + " " + smart1.model + " равен смартфону " + smart4.mark + " " + smart4.model);
        }
        else System.out.println("Смартфон " + smart1.mark + " " + smart1.model + " НЕ равен смартфону " + smart4.mark + " " + smart4.model);
        System.out.println("Хеш-код смартфона " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код смартфона " + smart5.mark + " " + smart4.model+  ": " + smart4.hashCode());


    }
}
