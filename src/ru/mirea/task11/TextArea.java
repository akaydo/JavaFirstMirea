package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JFrame {
    JTextArea textArea = new JTextArea();
    JMenuBar jMenuBar = new JMenuBar();
    JMenu color, font;
    JMenuItem blue,green,red,bold,normal,italic;
    public TextArea(){
        setSize(500,300);
        setLocationRelativeTo(null);
        setJMenuBar(jMenuBar);
        color = new JMenu("Color");
        font = new JMenu("Font");
        blue = color.add("blue");
        green = color.add("green");
        red = color.add("red");
        bold = font.add("bold");
        normal = font.add("normal");
        italic = font.add("italic");
        jMenuBar.add(color);
        jMenuBar.add(font);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        textArea.setPreferredSize(new Dimension(300,70));
        blue.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });
        green.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.GREEN);
            }
        });
        red.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        bold.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(Font.SERIF,Font.BOLD,14));
            }
        });
        normal.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(Font.SERIF,Font.PLAIN,14));
            }
        });
        italic.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(Font.SERIF,Font.ITALIC,14));
            }
        });
        add(textArea);
    }

    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        textArea.setVisible(true);
        textArea.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
