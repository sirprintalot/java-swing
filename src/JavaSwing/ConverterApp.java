package JavaSwing;

import java.util.*;

import static JavaSwing.Converter.showMenu;

public class ConverterApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int intValue = 0;


        while (intValue != 99) {
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
                case 3 -> Converter.convertValue("inches", "centimeters", 2.54, input);
                case 4 -> Converter.convertValue("centimeters", "inches", (1/2.54), input);
                case 5 -> Converter.convertValue("feet", "meters", 0.3048, input);
                case 6 -> Converter.convertValue("meters", "feet", 3.28084, input);

                case 99 -> System.out.println("Exiting program..");
                default -> System.out.println("Enter a valid option.");
            }
            System.out.println();
        }
        input.close();
    }
}
