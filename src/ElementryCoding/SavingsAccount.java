package ElementryCoding;

import java.util.Scanner;

public class SavingsAccount {
    /*
      This program calculates the value of a savings account after
      six months of monthly contributions. The user enters a monthly
      saving amount, and the program applies a 5% annual interest
      rate, converted to a monthly rate. It then computes the account
      balance at the end of each month by adding the savings and
      interest. Finally, the program displays the total account
      value after six months.
     */
    public static void main(String[] args) {

      // Create a scanner object for user input
        Scanner scanner =new Scanner(System.in);

      // Prompt the user to enter the monthly saving amount

        System.out.println("Enter the monthly amount: $");
        double monthlySaving = scanner.nextDouble();

        // Define the annual interest rate and calculate the monthly interest rate

        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate/12;

        // Initialize the account value
        double accountValue =0;

        // Calculate the account value after 6 months
        for(int month =0; month<6; month++) {
            accountValue = (accountValue+monthlySaving) * (1+monthlyInterestRate);
        }

        // Display the account value after 6 months
        System.out.println("The Account after 6 months is: "+ accountValue);

        // Close the Scanner
        scanner.close();


    }
}
