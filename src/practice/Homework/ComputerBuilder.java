package practice.Homework;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double screen;
        double price = 0;
        String cpu, storage, hdOr4k;
        int ram, storageSize;
        System.out.println("Select screen size:");
        screen = input.nextDouble();
        System.out.println("Select CPU type:");
        input.nextLine();
        cpu = input.nextLine();
        System.out.println("Select RAM size:");
        ram = input.nextInt();
        System.out.println("Select storage type:");
        input.nextLine();
        storage = input.next();
        System.out.println("Select storage size:");
        storageSize = input.nextInt();
        input.nextLine();
        System.out.println("Select screen resolution:");
        hdOr4k = input.next();


        if (screen == 13.3) {
            price = 200;
            if (cpu == "i3") {
                price += 150;
            } else if (cpu == "i5") {
                price += 250;
            } else if (cpu == "i7") {
                price += 350;
            } else ;

        } else if (screen == 15) {
            price = 300;
            if (cpu == "i3") {
                price += 150;
            } else if (cpu == "i5") {
                price += 250;
            } else if (cpu == "i7") {
                price += 350;
            } else ;
        } else if (screen == 17.3) {
            price = 400;
            if (cpu == "i3") {
                price += 150;
            } else if (cpu == "i5") {
                price += 250;
            } else if (cpu == "i7") {
                price += 350;
            } else ;


            if (storage == "SSD") {
                price += (storageSize / 500) * 100;
            } else if (storage == "HDD") {
                price = (storageSize / 500) * 50;
            } else ;
            if (hdOr4k == "4K") {
                price += 200;
            } else if (hdOr4k == "FULLHD") {
                price += 100;
            } else ;

            price += (ram / 4) * 50;

            System.out.println("Final price is: $" + price);

        }

    }
}
