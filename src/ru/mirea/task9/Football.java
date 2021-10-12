package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Football extends JFrame
{
    JPanel[] panel = new JPanel[3];

    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel label1 = new JLabel("Result: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");

    int milan = 0;
    int madrid = 0;

    public Football()
    {
        super("Game: AC Milan vs. Real Madrid"); //название приложения
        setSize(500,450);
        setLayout(new GridLayout(1,3)); // форма таблицы

        for (int i = 0; i < panel.length ; i++)
        {
            panel[i] = new JPanel();
            panel[i].setBackground(Color.PINK);
            add(panel[i]);
        }

        panel[0].setLayout(new BorderLayout());
        panel[0].add(button1, BorderLayout.CENTER);

        panel[2].setLayout(new BorderLayout());
        panel[2].add(button2, BorderLayout.CENTER);

        panel[1].setLayout(new FlowLayout());
        panel[1].add(label1);
        panel[1].add(label2);
        panel[1].add(label3);


        button1.addMouseListener(new MouseListener() // интерфейс MouseListener
        {
            public void mouseExited(MouseEvent e){}
            public void mouseClicked(MouseEvent e) // когда кнопка мыши была нажата на области компонента
            {
                milan++;
                label1.setText("Result: " + milan + " X " + madrid);
                label2.setText("Last Scorer: AC Milan");
                if (milan > madrid)
                    label3.setText("Winner: AC Milan");
                else if (madrid > milan)
                    label3.setText("Winner: Real Madrid");
                else
                    label3.setText("Winner: DRAW");
            }
            public void mouseEntered(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
        });

        button2.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent e){}
            public void mouseClicked(MouseEvent e)
            {
                madrid++;
                label1.setText("Result: " + milan + " X " + madrid);
                label2.setText("Last Scorer: Real Madrid");
                if (milan > madrid)
                    label3.setText("Winner: AC Milan");
                else if (madrid > milan)
                    label3.setText("Winner: Real Madrid");
                else
                    label3.setText("Winner: DRAW");
            }
            public void mouseEntered(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
        });
    }

    public static void main(String[]args)
    {
        new Football().setVisible(true);
    }
}