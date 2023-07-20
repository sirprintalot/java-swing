package JavaSwing;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ConverterGui extends JFrame {

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem option1;   //make an array list with the options!!
    private JMenuItem option2;
    private JMenuItem option3;

    public ConverterGui(){
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Swing intro");
        JPanel panel = new JPanel();

        showMenu();
        panel.add(menuBar);
        add(panel);
    }
    public void showMenu(){
        menuBar = new JMenuBar();
        menu = new JMenu("Choose a valid option: ");
        option1 = new JMenuItem("Centimeters to meters");
        option2 = new JMenuItem("Meters to centimeters");
        option3 = new JMenuItem("EXIT");

        menu.add(option1);
        menu.add(option2);
        menu.add(option3);

        menuBar.add(menu);


        option3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null , "Exiting program...");
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        ConverterGui window = new ConverterGui();
        window.setVisible(true);


 
    }
}
