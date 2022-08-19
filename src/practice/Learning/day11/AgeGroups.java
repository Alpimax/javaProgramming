package practice.Learning.day11;

public class AgeGroups {
    public static void main(String[] args) {
        /*
            age should be between 0 - 120
            < 1 baby
             2 - 5 toddler
             3 - 13 kid
             14 - 18 young adult
             19 - 30 adult
             31 - 65 middle age adult
             > 65 senior.
         */
        int age = 25;

        if (age >= 0 && age <= 120) {
            if (age <= 1) {
                System.out.println("Baby");
            } else if (age <= 5) {
                System.out.println("Toddler");
            } else if (age <= 13) {
                System.out.println("Kid");
            } else if (age <= 18) {
                System.out.println("Teenager");
            } else if (age <= 40) {
                System.out.println("Adult");
            } else if (age <= 65) {
                System.out.println("Middle Aged Adult");
            } else {
                // if I am here, the age is between 66 -120
                System.out.println("Senior");
            }
        } else {
            if (age < 0) {
                System.out.println("Ages can not be negative");
            } else {
                // invalid ages
                System.out.println(age + " invalid ages.");
            }
        }

    }
}
