package practice.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWorks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = " Hello! How are you? ";


        String[] revSentence = sentence.split(" ");
        String reverse ="";

        for (int i = revSentence.length - 1; i > 0; i--) {
           reverse += revSentence[i] + " ";
        }
        System.out.println(reverse.trim());
    }
}




