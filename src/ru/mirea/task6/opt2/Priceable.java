package ru.mirea.task6.opt2;

public interface Priceable {
    int getPrice();
}
class Chocolate implements Priceable{
    public int getPrice(){
        return 80;
    }
}
class Cake implements Priceable{
    public int getPrice(){
        return 150;
    }
}
class Cookie implements Priceable{
    public int getPrice(){
        return 60;
    }
}
class Test{
    public static void main(String[] args) {
        Chocolate c1 = new Chocolate();
        System.out.println(c1.getPrice());
        Cake cake = new Cake();
        System.out.println(cake.getPrice());
        Cookie cookie = new Cookie();
        System.out.println(cookie.getPrice());
    }
}
