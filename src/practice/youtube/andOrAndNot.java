package practice.youtube;

import java.util.Scanner;

public class andOrAndNot {
    public static void main(String[] args) {
        // logical operators = used to connect two or more expressions
        //
        //                  && = (AND) both conditions must be true
        //                  || = (OR) either condition must be true
        //                  !  = (NOT) reverses boolean value of condition

        int temp = 15;
        if( temp > 30 ){
            System.out.println("It's hot outside");
    } else if (temp >= 20 && temp <= 30) {
            System.out.println("It's warm outside");
        }else {
            System.out.println("It's cold outside");
        }

        Scanner reader = new Scanner(System.in);
        System.out.println("You are playing a game!!! \nPress q or Q to quit!!!");
        String quit = reader.nextLine();
        if(quit.equals("q") || quit.equals("Q") ){
            System.out.println("You quit the game!!!");
        }else
            System.out.println("You are still playing the game *** pew pew ***");





      }
    }