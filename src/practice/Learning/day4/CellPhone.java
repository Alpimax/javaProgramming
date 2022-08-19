package practice.Learning.day4;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "iPhone";
        String model = "IPhone X";
        String color = "Rose Gold";
        double price = 1_000.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';
        System.out.println("\t\tPhone information : \nBrand:"+ brand );
        System.out.println(model + " in" + color);
        System.out.println("With " + size + " gb the price is $" + price);
        System.out.println("Sim type: " + sim + " and has a cemara : " + hasCamera);
        System.out.println( );
        // Alternative solution:

        String report = "\tPhone information : \nBrand: " + brand +
                "\n" + model + " in" + color +
                "\nWith " + size + " gb the price is $" + price +
                "\nSim type: " + sim + " and has a cemara : " + hasCamera;
        System.out.println(report);

    }

}
