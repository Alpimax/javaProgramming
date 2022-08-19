package practice.Learning.Day22;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubeExample {
    public static void main(String[] args) {
        double[] prices = new double[4];

        prices[0] = 12.99;
        System.out.println(Arrays.toString(prices));

        prices[1] = 9.50;
        prices[2] = 13.50;
        prices[3] = 20.30;
        System.out.println(Arrays.toString(prices));
    }
}
