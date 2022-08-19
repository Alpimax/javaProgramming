package practice.Learning.day3;

public class Store {
    public static void main(String[] args) {
        int numberOfItems = 10000;
        System.out.println(numberOfItems + " in the store"); // combines the value of the numberOfItems variables with the characters ' in the store '
        numberOfItems = 700; // reassigned 700 into the variable
        System.out.println(numberOfItems + 5000);
        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment); // soutv

        double totalCost = 1_000_000.99; // 1,000,000.99 -> how we might want to write it, but commas are not valid java syntax, so we can use underscore in numbers, to improve readability.

        float f = 19.99F; // adding the letter f/F will tell the compiler this is a float number, not a double number
        float f2 = 100; // 100 is int type by default, and int is smaller than float, so there is no problem here.
        System.out.println(f);
        System.out.println(f2);

    }
}
