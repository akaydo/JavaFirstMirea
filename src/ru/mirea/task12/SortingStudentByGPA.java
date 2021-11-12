package ru.mirea.task12;
import java.util.Arrays;

public class SortingStudentByGPA {

    public static void quickSort(Comparable[] list, int start, int end) {
        int leftMarker = start;
        int rightMarker = end;
        int pivot = (int) list[(leftMarker + rightMarker) / 2];

        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (list[leftMarker].compareTo(pivot) > 0) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (list[rightMarker].compareTo(pivot) < 0) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = (int) list[leftMarker];
                    list[leftMarker] = list[rightMarker];
                    list[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < end) {
            quickSort(list, leftMarker, end);
        }
        if (start < rightMarker) {
            quickSort(list, start, rightMarker);
        }
    }

    public static void main(String[] args) {
        Comparable[] list = new Comparable[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (1 + Math.random() * 5);
        }
        int start = 0;
        int end = list.length - 1;
        quickSort(list, start, end);
        System.out.print(Arrays.toString(list));
    }
}
