package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class ConverterGui extends JFrame {

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem option1;   //make an array list with the options!!
    private JMenuItem option2;
    private JMenuItem option3;

    public ConverterGui(){
        JFrame frame =  new JFrame();  //create the jframe obj

        JPanel panel = new JPanel(); // create a panel
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); // set the borders of the panel (margin on
        // css)
        panel.setLayout(new GridLayout(4,5)); // define a layout style.
        frame.add(panel, BorderLayout.CENTER); // add the panel to the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the frame to close when hit the exit button
        setTitle("Swing intro"); // set the window title
        frame.setVisible(true); // make it visible
        frame.pack(); // pack makes the window big enough for fitting all the elements.
        frame.setSize(500, 500);
        



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

        option3.addActionListener(e -> {
            JOptionPane.showMessageDialog(null , "Exiting program...");
            System.exit(0);
        });

    }

    public static void main(String[] args) {
        ConverterGui window = new ConverterGui();
        


 
    }
}
