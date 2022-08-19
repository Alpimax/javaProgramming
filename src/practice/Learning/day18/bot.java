package practice.Learning.day18;

import java.util.Scanner;

public class bot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;


        while (run) {
            System.out.println("Enter your message");
            String msg = scanner.nextLine();

            switch (msg.toLowerCase()) {

                case "hello":
                    System.out.println("how are you?");
                    break;
                case "what is your age?":
                    System.out.println("I was programmed in july");
                    break;
                case "what do you like?":
                    System.out.println("I like Java");
                    break;
                default:
                    System.out.println("Shotting down!!!");
                    run = false;

            }

        }
    }
}
