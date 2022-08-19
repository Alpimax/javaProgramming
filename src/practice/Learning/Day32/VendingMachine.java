package practice.Learning.Day32;

import practice.Learning.my_utils.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("Soda");
        drinks.add("Juice");
        drinks.add("Water");
        drinks.add("Coffee");

        Scanner input = new Scanner(System.in);

        ArrayList<String> drink = new ArrayList<String>(Arrays.asList("Soda", "Juice", "Water", "Coffee"));

        System.out.println("Welcome. Which drink would you like?");
        String selection = StringUtil.fixFormat(input.next());

        if (drinks.contains(selection)) {
            System.out.println(selection + " is vending");
        } else
            System.out.println(selection + " is not in the vending machine");


    }
}
