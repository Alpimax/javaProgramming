package practice.Homework;

import java.util.Scanner;

public class AllUppercase {
    public static void main(String[] args) {

        //Intro String Tasks
        //-----------------------------------------------------------
        //
        //Declare and assign a String
        //print the String in all uppercase format and
        //print the String in all lowercase format
        String alper = "alper";
        System.out.println(alper.toUpperCase());
        alper ="ALPER";
        System.out.println(alper.toLowerCase());

        //
        //-----------------------------------------------------------
        //
        //Declare and assign a String for password
        //the password should be more than 8 character long
        //print: Valid password or Invalid password
        //
        String password = "ahioOHho";
        if(password.equals(password)){
            System.out.println("Valid password");
        }else
            System.out.println("Invalid password");

        //-----------------------------------------------------------
        //

        Scanner input = new Scanner(System.in);
        String read = input.nextLine();

        System.out.println(read.trim());
        read.trim();
        System.out.println(read.toLowerCase());
        System.out.println(read.length());
        //Use scanner to read a String from the console
        //Remove extra spaces in the beginning or end
        //Print in all lowercase
        //Print the number of characters
        //
        //-----------------------------------------------------------
    }
}
