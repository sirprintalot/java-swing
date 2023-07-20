package JavaSwing;

import java.util.*;

import static JavaSwing.Converter.showMenu;

public class ConverterApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inputValue = 0;

        while (inputValue != 9) {
            showMenu();
            inputValue = input.nextInt();

            switch (inputValue) {
                case 1:
                    Converter.convertValue("centimeters", "meters", 0.01, input);
                    break;
                case 2:
                    Converter.convertValue("meters", "centimeters", 100, input);
                    break;

                case 9:
                    System.out.println("Exiting program..");

                    break;

                default:
                    System.out.println("Enter a valid option.");
            }
            System.out.println();
        }
        input.close();
    }
}
