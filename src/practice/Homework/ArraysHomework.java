package practice.Homework;

import java.util.Scanner;

public class ArraysHomework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW
        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()){
                longest = words[i];
            }
        }
        System.out.println(longest);
    }
}
