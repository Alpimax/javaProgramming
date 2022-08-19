package practice.Homework;

import java.util.Scanner;

public class ifStatementHomework {
    public static void main(String[] args) {
        //If statement practice:
        //
        //Do all tasks hardcoded at least, then optionally make them more dynamic with Scanner
        //________________________________________________________________________
        //
        //Create two number variables
        //Find and print which number is bigger between the two

        int number1, number2;
        Scanner number = new Scanner(System.in);
        System.out.println("Could you give me two number? I will tell you which one bigger then another one.");
        System.out.println("Number one please : ");
        number1 = number.nextInt();
        System.out.println("Thank you! You gave me " + number1 + "\nCould I get another one. ");
        number2 = number.nextInt();
        System.out.println("Thank you! I got your numbers.");

        if (number1 > number2) {
            System.out.println(number1 + " is bigger");
        } else if (number1 == number2) {
            System.out.println(number1 + " and " + number2 + " equal. \nSorry!!! \nGame Over.");
        } else {
            System.out.println(number2 + " is bigger");
        }

        //
        //	ex:
        //		50
        //		45
        //
        //		output:
        //		50 is bigger
        //________________________________________________________________________
        //

        //________________________________________________________________________
        //

        //________________________________________________________________________
        //
        //create a sales amount variable
        //use the sales amount to determine the bonus you get at end of the month
        //
        //	if your sales amount is less than 10000 you don't get any bonus
        //
        //	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000
        //
        //	if your sales amount is more than or equal to 15000 you get a bonus of 7000
        //
        //	print your bonus number
        //
        //________________________________________________________________________
        //
        //create a char variable letter. Find and print if the character is a letter, number, or special character
        //
        //	ex: p
        //		letter
        //
        //	ex:
        //		6
        //		number
        //
        //	ex:
        //		$
        //		speical character
        //________________________________________________________________________
        //
        //create a number to represent the day. (1 being Monday and 7 being Sunday)
        //Print the day related to the number
        //
        //	Ex:
        //		2
        //		Tuesday
        //
        //	Ex:
        //		5
        //		Friday
        //________________________________________________________________________
        //
        //create a int variable to represent the month number, where 1 is Janurary and 12 is Decemeber.
        //use the month number input to determine how many days are in that month.
        //use the following data to help you determine the number of days in each month:
        //
        //	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
        //	Months that has 30 days: 4, 6, 9, 11
        //	Month that has 28 days: 2
        //
        //	ex:
        //		12
        //		31 days
        //
        //	ex:
        //		9
        //		30 days
    }
}
