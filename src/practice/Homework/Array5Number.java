package practice.Homework;

import java.util.Arrays;

public class Array5Number {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 23;
        number[1] = 1239;
        number[2] = 7545;
        number[3] = 43316;
        number[4] = 124123;
        System.out.println(Arrays.stream(number).max());
        System.out.println(number[5]);
        System.out.println(number[4]);
        System.out.println(number[3]);
        System.out.println(number[2]);
        System.out.println(number[1]);

    }
}
