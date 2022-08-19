package practice.Homework;

import java.util.Random;
import java.util.Scanner;

public class EnterASalary {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Could you give me your salary :");
        double salary = Scanner.nextDouble();
        System.out.println("Could you give me your number of hours :");
        int hours = Scanner.nextInt();
        double hoursRate = salary / (hours * 52);
        System.out.println("Your salary $" + salary + " is total hours: " + hours +", and you are making each hour $" + hoursRate);
        Random random = new Random();

    }

}
