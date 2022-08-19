package practice.Udemy;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Scanner readerText = new Scanner(System.in);

        System.out.println("Please enter a text :");
        String insertedText = readerText.nextLine();
        System.out.println("You entered the text: " + insertedText);
        System.out.println();
        System.out.println("Please enter a number :");
        int insertedNumber = reader.nextInt();
        System.out.println("You entered the number : " + insertedNumber);
        System.out.println();
        System.out.println("Please enter a float number");
        float insertedFloat = reader.nextFloat();
        System.out.println("You entered a float number " + insertedFloat);
        System.out.println();
        System.out.println("Please enter a text :");
        String insertedText2 = readerText.nextLine();
        System.out.println("You entered the text: " + insertedText2);
        System.out.println();
        System.out.println("Please enter a double number :");
        double insertedDouble = reader.nextDouble();
        System.out.println("You entered a double number " + insertedDouble);
        System.out.println();
        System.out.println("Please enter a boolean :");
        boolean insertedBoolean = reader.nextBoolean();
        System.out.println("You entered a boolean " + insertedBoolean);

    }
}
