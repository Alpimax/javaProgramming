package practice.Learning.day16;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("what is your first name?");
        String firstName = name.next();
        System.out.println("what is your last name?");
        String lastName = name.next();

         String  firstNameToupper = firstName.substring(0,1);
         firstNameToupper = firstNameToupper.toUpperCase();
         String fullname = firstNameToupper.concat(firstName.substring(1));
        System.out.println(fullname);

        // Saim style

        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase()+ lastName.substring(1);
        System.out.println(firstName);
    }
}
