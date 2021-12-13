package ru.mirea.task26;
import java.util.Scanner;

interface PayStrategy{
    public void payment();
}

class eWalletStrategy implements PayStrategy{

    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш заказ будет оплачен с помощью электронного кошелька. Введите номер кошелька: ");
        String card = sc.next();
        System.out.println("Введите пин-код: ");
        int pin = sc.nextInt();

        System.out.println("Заказ оформлен.");
    }
}

class debitCardStrategy implements PayStrategy{

    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш заказ будет оплачен с помощью дебетовой карты. Введите номер карты: ");
        String card = sc.next();

        System.out.println("Введите пин-код: ");
        int pin = sc.nextInt();

        System.out.println("Заказ оформлен.");
    }
}

public class Pay {
    int order_id;
    PayStrategy payStrategy;

    public Pay(int order_id) {
        this.order_id = order_id;
    }

    public void payment() {
        payStrategy.payment();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите артикул товара: ");
        int order = sc.nextInt();

        System.out.println("Теперь выберите способ оплаты: ");
        System.out.println("1 - Электронный кошелек");
        System.out.println("2 - Банковская карта");

        int action = sc.nextInt();
        Pay payment;
        switch (action) {
            case 1 -> payment = new eWalletPayment(order);
            case 2 -> payment = new debitCardPayment(order);
            default -> throw new IllegalStateException("Некорректное значение.");
        }
        payment.payment();
    }
}

class eWalletPayment extends Pay {
    public eWalletPayment(int order_id) {
        super(order_id);
        this.payStrategy = new eWalletStrategy();
    }
}

class debitCardPayment extends Pay{
    public debitCardPayment(int order_id) {
        super(order_id);
        this.payStrategy = new debitCardStrategy();
    }
}