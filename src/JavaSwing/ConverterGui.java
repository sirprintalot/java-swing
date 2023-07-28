package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class ConverterGui extends JFrame {

    JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu;

    public ConverterGui(){
//        try {
//            // Set Nimbus look and feel
//            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        Frame setup
        frame =  new JFrame("Converter 1.0");  //create the jframe obj
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the frame to close when hit the exit button
        frame.setSize(400, 400);
//        frame.setTitle();

        JMenuBar colorBar = new JMenuBar();
        colorBar.setOpaque(true);
        colorBar.setBackground(new Color(232, 11, 66));
        colorBar.setPreferredSize(new Dimension(400, 30));


        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(2, 5, 245));
        yellowLabel.setPreferredSize(new Dimension(200, 180));

        fileMenu = new JMenu("sdakbakbfa");
        colorBar.add(fileMenu);


        frame.setJMenuBar(colorBar);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);




//        JPanel panel1 = new JPanel(); // create a panel1
//        panel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // set the borders of the panel1 (margin on
//        // css)
//        panel1.setLayout(new GridLayout(6,2)); // define a layout style.
////        panel1.setPreferredSize(new Dimension(50, 50));
//        panel1.add(menuBar);
////        frame.pack(); // pack makes the window big enough for fitting all the elements.
//        frame.add(panel1, BorderLayout.WEST); // add the panel1 to the frame.


//        JPanel panel2 = new JPanel();
//        panel2.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
//        panel2.setLayout(new GridLayout(6, 2));
////        panel2.add(menuBar);


//        frame.add(panel2, BorderLayout.EAST);
//
//        showMenu();
        frame.pack();
        frame.setVisible(true); // make it visible

    }
    public void showMenu(){

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
//        ConverterGui window = new ConverterGui();
          SwingUtilities.invokeLater(ConverterGui::new);

 
    }
}
