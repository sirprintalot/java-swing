package JavaSwing;

import java.util.*;

public class Converter {

    public static void showMenu(){
        System.out.println("=================================================");
        System.out.println("Welcome to the Converter");
        System.out.println("OPTIONS:");
        System.out.println("1: cm to m");
        System.out.println("2: m to cm");
        System.out.println("3: inch to cm");
        System.out.println("4: cm to inch");
        System.out.println("5: ft. to m");
        System.out.println("6: m to ft.");
        System.out.println("99: EXIT");
        System.out.println("Choose a valid option:");
        System.out.println("=================================================");
        
    }
    
    public static void convertValue(String originUnit, String destinyUnit, double proportion, Scanner usInput){
        System.out.println("Choose " + originUnit + " to " + destinyUnit);
        System.out.println("Enter the value to be converted: ");
        double value = usInput.nextDouble();
        double finalValue = value * proportion;
        System.out.println("Result: " + value +" "+ originUnit + " is equal to: " +  finalValue + " " + destinyUnit);
        
    }
}
