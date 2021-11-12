package ru.mirea.task12;

import java.util.Arrays;

public class Student {
    private int iDNumber[];

    public Student() {
        iDNumber = new int[10];
        for (int i = 0; i < iDNumber.length; i++){
            iDNumber[i] = (int) (Math.random() * 100);{
                System.out.print(iDNumber[i]+" ");
            }
        }
        System.out.println();
    }

    public void Sort() {

        for (int left = 0; left < iDNumber.length; left++) {
            // Вытаскиваем значение элемента
            int value = iDNumber[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < iDNumber[i]) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            iDNumber[i + 1] = value;
        }
        System.out.print(Arrays.toString(iDNumber));
    }

    public static void main(String[] args) {
        Student arr = new Student();
        arr.Sort();
    }
}
