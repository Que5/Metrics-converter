/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unit_conversion;

/**
 *
 * @author Afika.Shwashwa
 */
import java.util.Scanner;
public class Unit_Conversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\nConvertable units: 'Feet' <-> 'Meters', 'Fahrenheit' <-> 'Celsius', 'Pounds' <-> 'Kilograms'\n\n");
   
        
        // Get the unit to convert from.
        System.out.print("Enter the unit you want to CONVERT FROM: ");
        String fromUnit = scanner.nextLine();

        // Get the unit to convert to.
        System.out.print("Enter the unit you want to CONVERT TO: ");
        String toUnit = scanner.nextLine();

        // Get the quantity to be converted.
        System.out.print("Enter the quantity you want to converted: ");
        double quantity = scanner.nextDouble();

        // Convert the quantity from the fromUnit to the toUnit.
        double convertedQuantity;
        if ((fromUnit.equals("feet")|| fromUnit.equals("Feet"))  && 
                (toUnit.equals("meters")|| toUnit.equals("Meters"))) {
            convertedQuantity = quantity * 0.3048;  
        } 
        else if ((fromUnit.equals("meters")|| fromUnit.equals("Meters")) && 
                ((toUnit.equals("feet")|| toUnit.equals("Feet")))) 
                {
            convertedQuantity = quantity * 3.281;  
                }
        else if ((fromUnit.equals("pounds")||fromUnit.equals("Pounds")) && 
                ((toUnit.equals("kilograms")||toUnit.equals("Kilograms")))){
 
            convertedQuantity = quantity / 2.205;
            } 
        
        else if ((fromUnit.equals("Kilograms")||fromUnit.equals("kilograms")) && 
                ((toUnit.equals("Pounds")||toUnit.equals("pounds")))){
 
            convertedQuantity = quantity * 2.205;
            } 
        
        
        else if ((fromUnit.equals("fahrenheit")|| fromUnit.equals("Fahrenheit") )&& 
                (toUnit.equals("Celsius")|| toUnit.equals("celsius"))) {
            convertedQuantity = (quantity - 32) * 5 / 9;
            }
        else if ((fromUnit.equals("Celsius")|| fromUnit.equals("celsius") )&& 
                (toUnit.equals("Fahrenheit")|| toUnit.equals("fahrenheit"))) {
            convertedQuantity = (quantity * 9/5)+ 32;
            }
        
        else {
            System.out.println("Invalid units.");
            return;
        }

        // Print the result of the conversion to the user.
        System.out.println(quantity + " " + fromUnit + " = " + convertedQuantity + " " + toUnit);
    }
}
    

