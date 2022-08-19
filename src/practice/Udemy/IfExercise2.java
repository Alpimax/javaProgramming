package practice.Udemy;

import java.util.Scanner;

public class IfExercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Which number do you want to know is it odd or even?");
        int number = reader.nextInt();
        if( number %2 == 1){
            System.out.println("This number is odd!!!");
        }else{
            System.out.println("This number is even!!!");
        }
    }
}
