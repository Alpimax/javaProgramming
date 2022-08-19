package practice.Learning.Day23;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are coming to party?");
        int size = input.nextInt();

        String[] names = new String[size];
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name of person " + (i + 1));
            String guest = input.next();
            names[i] = guest;
        }
        System.out.println("Final list coming to the party.");
        System.out.println(Arrays.toString(names));
    }
}
