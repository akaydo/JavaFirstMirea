package ru.mirea.sem2_task2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class Main {
    // вариант 11
    // Сортировка по имени в обратном порядке, фильтрация по возрасту
    //больше, чем 20, выбор первых 3 элементов списка, конкатенация имен в
    //строку через пробел
    public static void main(String[] args) {

        ArrayList<Human> humanList = new ArrayList<>(7);

        Human human_1 = new Human(21, "Карина", "Комиссарова", LocalDate.of(1996, 4, 20), 52);
        Human human_2 = new Human(19, "Яна", "Максимова", LocalDate.of(2001,5,7), 70);
        Human human_3 = new Human(30, "Анатолий", "Медведев", LocalDate.of(1962, 2, 2), 86);
        Human human_4 = new Human(40, "Геннадий", "Зубарев", LocalDate.of(1986, 5, 12), 59);
        Human human_5 = new Human(18, "Кристина", "Кулешова", LocalDate.of(2001, 12, 1), 55);
        Human human_6 = new Human(17, "Марина", "Николаева", LocalDate.of(2000, 5, 28), 75);
        Human human_7 = new Human(54, "Степан", "Козлов",LocalDate.of(1967, 2, 19), 80);

        humanList.add(human_1);
        humanList.add(human_2);
        humanList.add(human_3);
        humanList.add(human_4);
        humanList.add(human_5);
        humanList.add(human_6);
        humanList.add(human_7);

        // Изначальный поток

        Stream<Human> stream = humanList.stream();

        // Сортированный поток обратный по имени
        Stream<Human> streamSorted = humanList.stream()
                .sorted(Comparator.comparing(Human::getFirstName).reversed());

        // Отфильтрованный поток по возрасту >20
        Stream<Human> streamFiltered = humanList.stream()
                .filter(human -> human.getAge() > 20);

        System.out.println("Изначальный поток");
        stream.forEach(System.out::println);

        System.out.println("\nСортированный поток ");
        streamSorted.forEach((System.out::println));

        System.out.println("\nОтфильтрованный поток ");
        streamFiltered.forEach((System.out::println));

        System.out.println("\nВыбор первых 3 элементов списка: ");
        for (int i = 0; i < 3; i++)
        {
            System.out.println(humanList.get(i));
        }

        System.out.println("\nКонкатенация имен в строку через пробел:");
        String names = humanList.stream().map(Human::getFirstName).collect(Collectors.joining(" "));
        System.out.println(names);
    }
}
