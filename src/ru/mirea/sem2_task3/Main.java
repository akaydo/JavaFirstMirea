package ru.mirea.sem2_task3;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
// Set с использованием ключевого слова synchronized, List с
//использованием Lock.
public class Main {

    public static void main(String[] args) throws  Exception {
        String easy = RandomString.digits + "ABCDEFGHIJKLPRSTMNPQRUVWXYabcdefghijkprstuvwxy";
        Counter count1 = new Counter();

        System.out.println("Set с использованием ключевого слова synchronized");
        HashSet<String> ex_1 = new HashSet<String>();
        // Для работы с потоком используется класс Thread
        Thread ex1_1 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                count1.plus1();
                RandomString gen = new RandomString(9, new SecureRandom(), easy);
                ex_1.add(gen.nextString1());
            }
        });
        Thread ex1_2 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                count1.plus1();
                RandomString gen = new RandomString(9, new SecureRandom(), easy);
                ex_1.add(gen.nextString1());
            }
        });
        ex1_1.start();
        ex1_2.start();
        Thread.sleep(3000);
        System.out.println("Было сгенерировано " +count1.getCount()+ " строк и добавлено в коллекцию\n");

        System.out.println("List с использованием Lock");
        List<String> ex_2 = new ArrayList<>();
        Counter count2 = new Counter();
        Thread ex2_1 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                count2.plus2();
                RandomString gen = new RandomString(9, new SecureRandom(), easy);
                ex_2.add(gen.nextString2());
            }
        });
        Thread ex2_2 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                count2.plus2();
                RandomString gen = new RandomString(9, new SecureRandom(), easy);
                ex_2.add(gen.nextString2());
            }
        });
        ex2_1.start();
        ex2_2.start();
        Thread.sleep(3000);
        System.out.println("Было сгенерировано " +count2.getCount()+ " строк и добавлено в словарь");
    }
}
