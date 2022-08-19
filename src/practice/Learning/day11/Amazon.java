package practice.Learning.day11;

public class Amazon {
    public static void main(String[] args) {
        double price = 100.99;
        boolean isPrime = false;

        if (isPrime) {
            System.out.println("Free 2 days shipping");
        } else {
            System.out.println("You are not Amazon Prime ");
            if (price >= 25) {
                System.out.println("Free shipping available");
            } else {
                System.out.println("Shipping cost is 2.99");
            }
        }
    }
}
