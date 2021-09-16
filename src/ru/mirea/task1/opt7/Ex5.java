package ru.mirea.task1.opt7;
import java.util.Scanner;
import java.lang.*;

public class Ex5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = input.nextInt();
        int factor = 1;
        for (int i=1; i <= num; i++) {
            factor = factor*i;
        }
        System.out.println("Факториал числа: " +factor);
    }
}
