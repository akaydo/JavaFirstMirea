package ru.mirea.sem2_task1;

public class Main {
    // вариант 11
    // Имплементировать интерфейс Predicate, определяющий, является ли
    // число степенью двойки
        public static void main(String[] args) {
            Predicate<Integer> isDegreeOfTwo = n -> ((n > 0) && ((n & (n - 1)) == 0));
            // n и (n-1) не имеют общих единиц в двоичном представлении
            System.out.println(isDegreeOfTwo.test(48));
            System.out.println(isDegreeOfTwo.test(128));
            System.out.println(isDegreeOfTwo.test(-8));
        }
    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }
    }
