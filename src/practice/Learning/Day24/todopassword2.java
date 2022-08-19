package practice.Learning.Day24;

import java.util.Scanner;

public class todopassword2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a password");
        String password = input.next();

        boolean lowerCase = false;
        boolean upperCase = false;
        boolean specialCase = false;
        boolean digitNumber = false;
        boolean isCorrect = false;
        String text = "";
        while (!isCorrect) {


            if (password.length() == 6 && !password.contains(" ")) {

                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                        digitNumber = true;
                    }
                    if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                        upperCase = true;
                    }
                    if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                        lowerCase = true;
                    }
                    if (password.charAt(i) >= 41 && password.charAt(i) <= 57) {
                        specialCase = true;
                    }
                }
                if (digitNumber && upperCase && lowerCase && specialCase) {
                    isCorrect = true;
                    break;
                } else {
                    System.out.println("Please make a bundle with uppercase, lowercase,special character and digit number. " );

                }
                password = input.next();

            }
            System.out.println("First thing first get 6 letters!!!\nSpace doesn't make it safe...");
            password = input.next();

        }
        System.out.println(isCorrect);
    }

}
