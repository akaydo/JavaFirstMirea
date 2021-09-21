package ru.mirea.task5;
import java.lang.*;

public abstract class Dish {
    private String material;
    private String destiny;

    public String getMaterial(){
        return material;
    }
    public String getDestiny(){
        return destiny;
    }

    public Dish(String material, String destiny){
        this.material = material;
        this.destiny = destiny;
    }

    public abstract void Info();
}

class Pot extends Dish{
    private final int depth;
    private int kind;

    public Pot(String material, String destiny,int depth){
        super(material, destiny);
        this.depth = depth;
    }
    public void Info(){
        System.out.println("Кастрюля, выполн. из материала: "+super.getMaterial()+". Предназначение: "+ super.getDestiny() + ". Имеет глубину: "+ depth+" литра.");
    }
}
class Pan extends Dish{
    private String kind;

    public Pan(String material, String destiny, String kind){
        super(material, destiny);
        this.kind = kind;
    }
    public void Info(){
        System.out.println(kind + ", выполн. из материала: "+super.getMaterial()+". Предназначение: "+ super.getDestiny());
    }
}