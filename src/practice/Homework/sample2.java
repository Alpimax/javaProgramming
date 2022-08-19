package practice.Homework;

import java.util.*;
import java.util.Scanner;

public class sample2 {
    public static void main(String[] args) {
        System.out.println(roundSum(2, 29, 9));

        System.out.println(Math.abs(-20));
    }



    public static int roundSum(int a, int b, int c) {
        a = round10(a);
        b = round10(b);
        c = round10(c);

        return a+b+c;

    }

    public static int round10(int num){
        int d = num / 10 ;

        if(num % 10 >=5)
            num = (d+1 )* 10 ;
        else
            num = d * 10 ;
        return num;

    }
}





