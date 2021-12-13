package ru.mirea.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Date_Build {
    long getMlsc(String date_str) {
        long mlsc = -1;
        SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date date = a.parse(date_str);
            mlsc = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return mlsc;
    }
}

class T_Date extends Date_Build {
    public Date build(String date_str) {
        Date date;
        long mlsc = getMlsc(date_str);
        date = new Date(mlsc);
        return date;
    }
}

class T_Calendar extends Date_Build {
    Calendar build(String date_str) {
        Calendar calendar = Calendar.getInstance();

        try {
            SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            calendar.setTime(a.parse(date_str));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return calendar;
    }
}

class Main {
    String lastname;
    Calendar taskReceiptDate;
    Date handoverTaskDate;

    public Main(String lastname, Calendar taskReceiptDate) {
        this.lastname = lastname;
        this.taskReceiptDate = taskReceiptDate;
    }

    public void handOver() { this.handoverTaskDate = new Date(); }

    public String toString() {
        return "Main{" +
                "lastname='" + lastname + '\'' +
                ", taskReceiptDate=" + taskReceiptDate +
                ", handoverTaskDate=" + handoverTaskDate +
                '}';
    }
}

public class Time {
    void task1() {
        System.out.println("Введите дату в следующем формате: yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");;
        String dateString = scanner.next();

        T_Date t_date = new T_Date();
        Date date = t_date.build(dateString);
        System.out.println(date);

        T_Calendar t_calendar = new T_Calendar();
        Calendar calendar = t_calendar.build(dateString);
        System.out.println(calendar);
    }

    void task2() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String lastName;
        String receiptDateStr;

        System.out.println("Введите фамилию студента: ");
        lastName = scanner.next();
        System.out.println("Введите дату получения задания: yyyy-MM-dd HH:mm");
        receiptDateStr = scanner.next();

        T_Calendar t_calendar = new T_Calendar();
        Calendar receiptDate = t_calendar.build(receiptDateStr);
        Main main = new Main(lastName, receiptDate);

        main.handOver();

        System.out.println(main);
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.task1();
        time.task2();
    }
}