package ru.mirea.sem2_task6.abstract_factory;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        TeaFactory tea = null;
        System.out.println("There are two types of tea: Green and Black");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        switch (str){
            case "Green":
                tea = new GreenTeaFactory();
                break;
            case "Black":
                tea = new BlackTeaFactory();
                break;
        }
        System.out.println("Indian or Turkish?");
        String string = in.nextLine();
        switch (string){
            case "Indian":
                tea.createIndianTea();
                break;
            case "Turkish":
                tea.createTurkishTea();
                break;
        }
    }
}