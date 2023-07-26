package JavaSwing;

import java.util.*;

import static JavaSwing.Converter.showMenu;

public class ConverterApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int intValue = 0;


        while (intValue != 9) {
            showMenu();

            while(!input.hasNextInt() && !input.hasNextDouble()) {
                System.out.println("Only numbers allowed!!");
                input.next();
            }
            if (input.hasNextInt()) {
                intValue = input.nextInt();
            }
            
            switch (intValue) {
                case 1 -> Converter.convertValue("centimeters", "meters", 0.01, input);
                case 2 -> Converter.convertValue("meters", "centimeters", 100, input);
                case 9 -> System.out.println("Exiting program..");
                default -> System.out.println("Enter a valid option.");
            }
            System.out.println();
        }
        input.close();
    }
}
