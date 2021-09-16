package ru.mirea.task1.opt6;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class Ex4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = rand.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Отсортированный массив: "+array[i]);
        }
    }
}
