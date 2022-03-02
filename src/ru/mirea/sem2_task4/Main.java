package ru.mirea.sem2_task4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    // Реализовать собственную имплементацию ExecutorService с
    //единственным параметром конструктора – количеством потоков.
    public static void main(String[] args) {

        ExecutorService executorService =
                // фиксированный пул потоков
                Executors.newFixedThreadPool(3);
        // submit() отправляет выполняемую задачу в ExecutorService
        // и возвращает результат типа Future
        executorService.submit(() -> {
            try {
                Thread.sleep(200); // пауза
            } catch (InterruptedException e) { // InterruptedException сигнализирует о том, что работу потока хотят завершить.
                e.printStackTrace();
            }
            System.out.println("Я молодец");
        });
        executorService.submit(() -> System.out.println("Старт"));
    }
}
