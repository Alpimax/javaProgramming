package practice.Learning.day19;

import java.util.Scanner;

public class color {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfColors = 0;
        String colors ="";

        while (numOfColors<3){
            System.out.println("Enter the next color.");
            String inputColor = input.nextLine().toLowerCase();

            if(!colors.contains(inputColor)){ // if the color is unique, color String does not have the value already
                colors += " " + inputColor;
                numOfColors++;
            }

        }

        System.out.println(colors.trim());

    }
}
