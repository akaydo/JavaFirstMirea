package ru.mirea.task5.opt3;

public abstract class Furniture {
    private String material;
    private String color;
    public Furniture(String material, String color) {
        this.material = material;
        this.color = color;
    }
    public String getMaterial(){
        return this.material;
    }
    public String getColor(){
        return this.color;
    }
}
class Closet extends Furniture {
    private String type;
    private double height;
    public Closet(String material, String color, String type, double height){
        super(material, color);
        this.type = type;
        this.height = height;
    }
    public String toString(){
        return "Материал: " + super.getMaterial() + ", Цвет: "+super.getColor()+", Тип: "+this.type+", Высота: "+this.height;
    }
}
class Bed extends Furniture {
    private String type;
    private double width;
    public Bed(String material, String color, String type, double width){
        super(material, color);
        this.type = type;
        this.width = width;
    }
    public String toString(){
        return "Материал: " + super.getMaterial() + ", Цвет: "+super.getColor()+", Тип: "+this.type+", Ширина: "+this.width;
    }
}
