package ru.mirea.task11;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class Guess extends JFrame {
    JTextField jTextField = new JTextField();
    JButton button = new JButton();
    Random random = new Random();
    int number;
    int counter;
    int result;
    String text;

    public Guess(){
        setSize(500,300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        jTextField.setPreferredSize(new Dimension(300,70));
        button.setPreferredSize(new Dimension(150,60));
        jTextField.setHorizontalAlignment(0);
        jTextField.setFont(new Font("TimesRoman",Font.BOLD,30));
        button.setFont(new Font("TimesRoman",Font.BOLD,28));
        button.setText("Ввод");
        createNumber();
        button.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                guess();
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }
        });
        add(jTextField);
        add(button);
    }

    private void createNumber(){
        counter = 3;
        number = random.nextInt(20);
    }

    private void guess(){
        text = jTextField.getText();
        try {
            result = Integer.parseInt(text);
        }
        catch (NumberFormatException e){
            jTextField.setText("");
            showMessageDialog(null, "Это не число!");
            return;
        }
        if(result<number){
            counter--;
            showMessageDialog(null, "Загаданное число больше. \n Осталось попыток: " + counter);
        }
        else if(result>number){
            counter--;
            showMessageDialog(null, "Загаданное число меньше. \n Осталось попыток: " + counter);
        }
        else{
            showMessageDialog(null, "Поздравляю! Вы угадали число!");
            createNumber();
        }
        if(counter == 0){
            showMessageDialog(null, "Попытки кончились. Вы проиграли :(");
            createNumber();
        }
    }

    public static void main(String[] args) {
        Guess guess = new Guess();
        guess.setVisible(true);
        guess.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}