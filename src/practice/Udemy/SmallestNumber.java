package practice.Udemy;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your first number :");
        int first = reader.nextInt();
        System.out.println("Please enter your second number :");
        int second = reader.nextInt();
        System.out.println("Please enter your third number :");
        int third = reader.nextInt();
        int smallest =first;
        if(second < smallest){
            smallest = second;
        } else if (third < smallest) {
            smallest = third;
        }
        System.out.println("The smallest provided number is " + smallest);
    }
}
