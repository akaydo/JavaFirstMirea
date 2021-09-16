package ru.mirea.task1.opt3;
import java.lang.*;
import java.util.Scanner;

public class Ex1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        System.out.println("Введите массив:");
        for (int i=0; i < n; i++)
        {
            array[i] = scanner.nextInt();
        }
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Сумма элементов массивов равна: " + sum);
    }
}
