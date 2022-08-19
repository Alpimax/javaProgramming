package practice.Learning.day28;

import java.util.Scanner;

public class homework28_6 {
    public static int frequency(String brand, char c) {
        int count = 0;
        if (brand.contains("" + c)) {
            for (int i = 0; i < brand.length(); i++) {
                if (c == brand.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter brand name");
        String brand = input.nextLine();
        System.out.println("Please enter character");
        char c = input.next().charAt(0);

        System.out.println(frequency(brand,c));

    }
}