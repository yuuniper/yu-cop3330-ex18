/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alice Yu
 */
package base;
import java.util.Scanner;

/*
Exercise 18 - Temperature Converter
You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.

The formulas are

C = (F − 32) × 5 / 9
and

F = (C × 9 / 5) + 32
Example Output
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.

Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Break the program into functions that perform the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
Modify the program so it also supports the Kelvin scale.
 */

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        System.out.println("Press C to convert from Fahrenheit to Celsius. ");
        System.out.println("Press F to convert from Celsius to Fahrenheit. ");
        String system = myApp.readInputString("Your choice: ");


        if (system.equals("C") || system.equals("c"))
        {
            int degrees = myApp.readInputInteger("Please enter the temperature in Fahrenheit: ");
            double temp = (degrees - 32) * 5 / 9;
            String outputString = ("The temperature in Celsius is " + temp);
            myApp.printOutput(outputString);
        }
        else if (system.equals("F") || system.equals("f"))
        {
            int degrees = myApp.readInputInteger("Please enter the temperature in Celsius: ");
            double temp = (degrees * 9 / 5) + 32;
            String outputString = ("The temperature in Fahrenheit is " + temp);
            myApp.printOutput(outputString);
        }

    }

    public int readInputInteger(String input)
    {
        System.out.print(input);
        String num = in.next();
        return Integer.parseInt(num);
    }

    public String readInputString(String input)
    {
        System.out.print(input);
        String string = in.next();
        return string;
    }

    public void printOutput(String input)
    {
        System.out.println(input);
    }
}
