package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;

public class CImage extends JComponent {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("Image");
        jFrame.setSize(800,800);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLocation(450,300);
        jFrame.add(new Comp(args[0]));
    }
}

class Comp extends CImage{
    private String s;
    Comp(String s){
        this.s = s;
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Image image = new ImageIcon(s).getImage();
        g2.drawImage(image,10,10,null);
    }
}
