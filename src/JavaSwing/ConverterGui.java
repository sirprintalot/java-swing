package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class ConverterGui extends JFrame {

    private JMenuBar menuBar;

    public ConverterGui(){
        JFrame frame =  new JFrame();  //create the jframe obj
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the frame to close when hit the exit button
        frame.setVisible(true); // make it visible
        frame.setSize(500, 500);
        frame.setTitle("Converter 1.0");


        JPanel panel1 = new JPanel(); // create a panel1
        panel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // set the borders of the panel1 (margin on
        // css)
        panel1.setLayout(new GridLayout(2,2)); // define a layout style.
        panel1.setPreferredSize(new Dimension(100, 100));
        panel1.add(menuBar);
//        frame.pack(); // pack makes the window big enough for fitting all the elements.

        frame.add(panel1, BorderLayout.CENTER); // add the panel1 to the frame.



        JPanel panel2 = new JPanel();
        showMenu();

    }
    public void showMenu(){
        menuBar = new JMenuBar();
        JMenu menu = new JMenu("Distance: ");
        //make an array list with the options!!
        JMenuItem option1 = new JMenuItem("Centimeters to meters");
        JMenuItem option2 = new JMenuItem("Meters to centimeters");
        JMenuItem option3 = new JMenuItem("EXIT");

        menu.add(option1);
        menu.add(option2);
        menu.add(option3);

        menuBar.add(menu);

        option3.addActionListener(e -> {
            JOptionPane.showMessageDialog(null , "Exiting program...");
            System.exit(0);
        });

    }

    public static void main(String[] args) {
//        SwingUtilities.invokeLater(ConverterGui::new);
        ConverterGui window = new ConverterGui();
             

 
    }
}
