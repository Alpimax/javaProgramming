package practice.Learning.day13;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vending Machine. Select the menu you want to see: \n\tSnacks \n\tDrinks");
        String menu = input.next();
        switch (menu) {
            case "Snack":
                System.out.println("Pick the snack: \n 1)Chips 2) Cookies 3)Pretzels 4)Candy");
                int snackOption = input.nextInt();
                if (snackOption == 1) {

                }

        }
    }
}
