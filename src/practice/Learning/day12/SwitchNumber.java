package practice.Learning.day12;

public class SwitchNumber {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Socks\nThank you for your purchase!\nYour current balance is: 95$");
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Number should be between 1 and 5");
        }
    }
}
