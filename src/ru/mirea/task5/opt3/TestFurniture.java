package ru.mirea.task5.opt3;

public class TestFurniture {
    public static void main(String[] args){
        Closet c1 = new Closet("дерево", "бежевый", "для офиса", 2.0);
        Bed s1 = new Bed("дерево", "коричневый", "для спальни", 1.7);
        System.out.println("Шкаф-купе. " + c1);
        System.out.println("Кровать. "+ s1);
    }
}
