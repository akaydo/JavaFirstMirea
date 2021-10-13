package ru.mirea.task10;
import java.lang.*;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = sc.nextInt();
        System.out.println("Введите b: ");
        int b = sc.nextInt();
        System.out.println(without00(a,b)+" последовательности");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, десятичная запись которого не содержит нулей: ");
        int n = scanner.nextInt();
        System.out.print("Перевёрнутое число: ");
        reverse_task10(n);
        System.out.println();

        System.out.println("Введите числа: ");
        System.out.println(count_task11() + " единицы");
        System.out.println();

        System.out.println("Введите последовательность чисел: ");
        notEven_task12();
        System.out.println();

        System.out.println("Введите последовательность чисел: ");
        notEvenNumber(0);
    }

    //R(a,b) = R(a,b-1) + R(a-1, b-1)
    public static int without00(int a, int b) {
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return without00(a, b - 1) + without00(a - 1, b - 1);
    }

    public static int reverse_task10(int n) {
        if(n < 10) {
            System.out.print(n);
            return n;
        }
        else {
            System.out.print(n % 10);
            return reverse_task10(n/10);
        }
    }

    public static int count_task11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 00)
            return 0;
        if (n == 1)
            return count_task11() + 1;
        else
            return count_task11();
    }

    public static void notEven_task12() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        x = sc.nextInt();
        if (x <= 0)
            return;
        else if (x%2 == 1) {
            System.out.println(x);
            notEven_task12();
        }
        else
            notEven_task12();
    }

    public static void notEvenNumber(int i) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        x = sc.nextInt();
        if (x == 0)
            return;
        else if (i % 2 == 1) {
            System.out.println(x);
            i++;
            notEvenNumber(i);
        } else {
            i++;
            notEvenNumber(i);
        }
    }
}
