package ElementryCoding;

import java.util.Scanner;

public class BMICalculator {

    /*
    (Health application: computing BMI)
    Write a program that prompts the user to enter a weight
    in pounds and height in inches and displays the BMI.
     Note that one pound is 0.45359237 kilograms and one
     inch is 0.0254 meters.
     */
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.println("Enter your wight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Prompt the user to enter height in inches
        System.out.println("Enter your height in inches: ");
        double heightInInches = scanner.nextDouble();

        // Convert weight to kilograms (1 pound = 0.45359237 kg)
        double weightInKilograms = weightInPounds * 0.45359237;

        // Convert height to meters (1 inch = 0.0254 m)
        double heightInMeters = heightInInches * 0.0254;

        // calculate BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display the BMI
        System.out.println("Your BMI is: "+bmi);

        // Close the Scanner
        scanner.close();

    }
}
