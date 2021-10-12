package ru.mirea.task8.opt1;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public Main(){
        super("Shape");
        setLayout(null);
        setSize(800,900);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        for (int i=0; i<20;i++){
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B = (int)(Math.random()*256);
            int x = (int)(Math.random()*2);
            switch(x){
                case 0: {
                    Rectangle r = new Rectangle( i * 15, i*20, (int)(Math.random()*100+10), (int)(Math.random()*100+10), new Color(R,G,B));
                    g.setColor(r.getColor());
                    g.drawRect((int) r.getX(), (int) r.getY(), r.getHeight(), r.getWidth());
                    break;
                }
                case 1:{
                    Circle c = new Circle(i*20,i*10,(int)(Math.random()*100+10),new Color(R,G,B));
                    g.setColor(c.getColor());
                    g.drawOval((int) c.getX(), (int) c.getY(), c.getRadius(), c.getRadius());
                    break;
                }
                default: break;
            }
        }
    }
    public static void main(String[] args)
    {
        Main frame = new Main();
    }
}
