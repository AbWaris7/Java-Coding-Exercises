package ElementryCoding;

import java.util.Scanner;

public class Lottery {


    /*
    Suppose you want to develop a program to play lottery.
    The program randomly generates a lottery of a two-digit number,
    prompts the user to enter a two-digit number, and determines
    whether the user wins according to the following rules:
   1. If the user input matches the lottery number in the
   exact order, the award is $10,000. 2. If all digits in
   the user input match all digits in the lottery number,
   the award is $3,000. 3. If one digit in the user input
   matches a digit in the lottery number, the award is $1,000.
   Note that the digits of a two-digit number may be 0.
   If a number is less than 10, we assume the number is
   preceded by a 0 to form a two-digit number. For example,
   number 8 is treated as 08 and number 0 is treated as 00 in the
   program.
     */
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int)(Math.random() * 100);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick(Two Digits): ");
        int guess= input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery/10;
        int lotteryDigit2 = lottery%10;

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The Lottery number is "+lottery);

        // Check the guess
        if(guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        }
        else if (guessDigit2 == lotteryDigit1
                 && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
            }
        else if(guessDigit1 == lotteryDigit1 ||
                guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1 ||
                guessDigit2 == lotteryDigit2)
        {
            System.out.println("Match on digit: you win $1,000");

        }
        else {
            System.out.println("Sorry, no match ");
        }
    }
}
