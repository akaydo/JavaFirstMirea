package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poppy extends JFrame {
    private String[][] array = new String[][] {{ "" , "NORTH", "" },
            { "WEST"  , "CENTER", "EAST" },
            { "", "SOUTH" , "" }};
    private String[] columnsHeader = new String[] {"", "", ""};

    public Poppy() {
        super("Карта");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 180);
        setVisible(true);
        setLocationRelativeTo(null);
        JTable table = new JTable(array, columnsHeader);
        table.setShowGrid(true);
        table.setRowHeight(50);
        table.setShowGrid(true);
        table.setGridColor(Color.black);
        table.setRowSelectionAllowed(false);

        table.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                if(table.isColumnSelected(1) == true && table.isRowSelected(0) == true)
                    JOptionPane.showMessageDialog(Poppy.this, "Добро пожаловать в Архангельск!");
                if(table.isColumnSelected(0) == true && table.isRowSelected(1) == true)
                    JOptionPane.showMessageDialog(Poppy.this, "Добро пожаловать в Калининград!");
                if(table.isColumnSelected(1) == true && table.isRowSelected(1) == true)
                    JOptionPane.showMessageDialog(Poppy.this, "Добро пожаловать в Москву!");
                if(table.isColumnSelected(2) == true && table.isRowSelected(1) == true)
                    JOptionPane.showMessageDialog(Poppy.this, "Добро пожаловать во Владивосток!");
                if(table.isColumnSelected(1) == true && table.isRowSelected(2) == true)
                    JOptionPane.showMessageDialog(Poppy.this, "Добро пожаловать в Геленджик!");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        // Размещение таблиц в панели с блочным расположением
        Container contents = this.getContentPane();
        contents.add(table);
    }

    public static void main(String[] args) {
        new Poppy();
    }
}
