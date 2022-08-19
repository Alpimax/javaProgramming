package practice.Homework;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a angle number : ");
        float num1 = scanner.nextFloat();
        System.out.println("Give me a angle number : ");
        float num2 = scanner.nextFloat();
        System.out.println("Give me a angle number : ");
        float num3 = scanner.nextFloat();
        float numTotal = num1 + num2 + num3;
        boolean triangle = numTotal >= 180 ;
        boolean circle = numTotal == 360 ;
        System.out.println("You can make triangle with these number = = " + triangle);
        System.out.println("You can make circle with these number = " + circle);
    }
}
