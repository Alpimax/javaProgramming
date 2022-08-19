package practice.Learning.Day24;


import java.util.Scanner;

public class TryTodoPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        boolean isCorrect   = false;
        boolean digitNumber = false;
        boolean upperCase   = false;
        boolean lowerCase   = false;
        boolean specialCase = false;

        while (!isCorrect) {
            System.out.println("Enter a password, I'll tell you if it is valid or not!!!");
            String password = input.nextLine();

            if ((password.length() >= 6) && !password.contains(" ")) {
                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) >= 48 && password.charAt(i) <= 57)
                        digitNumber = true;

                    if (password.charAt(i) >= 65 && password.charAt(i) <= 90)
                        upperCase = true;

                    if (password.charAt(i) >= 97 && password.charAt(i) <= 122)
                        lowerCase = true;

                    if (password.charAt(i) >= 33 && password.charAt(i) <= 47) {
                        specialCase = true;
                    } else if (password.charAt(i) >= 58 && password.charAt(i) <= 64) {
                        specialCase = true;
                    } else if (password.charAt(i) >= 91 && password.charAt(i) <= 96) {

                    } else if (password.charAt(i) >= 123 && password.charAt(i) <= 126) {
                    }

                }
            }
            if (digitNumber && upperCase && lowerCase && specialCase) {
                isCorrect = true;
                break;
            }
            System.out.println("I think this password does not solve your problem!!! ");
            System.out.println("Let's try again");
        }
        System.out.println(isCorrect);
    }
}


