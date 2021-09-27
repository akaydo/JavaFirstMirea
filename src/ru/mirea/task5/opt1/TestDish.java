package ru.mirea.task5.opt1;

public class TestDish {
    public static void main(String args[]){
        Pot p1 = new Pot("алюминий","приготовление пищи",2);
        p1.Info();
        Pan pan1 = new Pan("сталь","приготовление пищи","Жаровня");
        Pan pan2 = new Pan("чугун","приготовление пищи","Сотейник");
        pan1.Info();
        pan2.Info();
    }
}
