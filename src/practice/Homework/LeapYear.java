package practice.Homework;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Could you give me a year =");
        int number = year.nextInt();

        if(number % 4 == 0){
            System.out.println("This year " + number +" can divisible by 4 ");
        }else {
            System.out.println("This year " + number +" can NOT divisible by 4 ");
        }
    }
}
