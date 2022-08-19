package practice.Learning.day28;

import java.util.Scanner;

public class homework28_3 {


    public static double converter (String currency, int money){
        double total = 0;
        switch (currency.toLowerCase()){
            case "euro":
                return total = money * 0.91;
            case "yen":
                return total = money * 121.03;
            case "lira":
                return total = money * 17.91;
            case "won":
                return total = money * 1_217.52;
            case "rupe":
                return total = money * 181.45;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter currency name");
        String currency = input.next();
        System.out.println("Please enter currency amount");
        int money = input.nextInt();

        System.out.println(converter(currency, money));
    }

}
