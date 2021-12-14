package ru.mirea.task29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] territoryInfo = {"В России 49 областей", "В Германии 13 областей", "В Украине 24 области"};
        String[] resourcesInfo = {"В России ВВП 4,097 трлн. долларов", "В Германии ВВП 3,806 трлн. долларов", "В Украине ВВП 155,6 млрд. долларов"};
        String[] diplomacyInfo = {"Германия воюет с Россией, Россия отобрала у Украины Крым"};

        CurrencyInfo currencyInfo = new CurrencyInfo(territoryInfo, resourcesInfo, diplomacyInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Code\\Java\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем данные в файл
        objectOutputStream.writeObject(currencyInfo);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("C:\\Code\\Java\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(currencyInfo1);
    }
}