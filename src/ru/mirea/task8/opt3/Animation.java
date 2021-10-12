package ru.mirea.task8.opt3;
import java.awt.*;
import java.awt.event.*;

    class Animation extends Frame
    {
        private Image[] img=new Image[5];
        private int count;
        Animation (String s)
        {
            super(s);
            MediaTracker tr=new MediaTracker(this);
            for (int k=0; k<5; k++)
            {
                img[k]=getToolkit().getImage("C:\\Users\\Кристина\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\image"+(k+1)+".gif");
                tr.addImage(img[k],0);
            }
            try
            {
                tr.waitForAll();
            }
            catch (InterruptedException e){}
            setSize(300, 500);
            setVisible(true);
        }
        public void paint(Graphics g)
        {
            g.drawImage(img[count%5], 0, 0, this);
        }
        public void update(Graphics g) {paint(g); }
        public void go()
        {
            while(count<1000)
            {
                repaint();
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e){}
                count++;
            }
        }
        public static void main(String[] args)
        {
            Animation anim_window=new Animation("Simple Animation");
            anim_window.go();
            anim_window.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent ev)
                {
                    System.exit(0);
                }
            });
        }
    }
