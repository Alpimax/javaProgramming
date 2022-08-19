package practice.Learning.Day24;

import java.util.Arrays;

public class ArraysInloop {
    public static void main(String[] args) {


        int[] arr = {1, 2, 4, 5, 6, 7};
            int[] reverse = new int[arr.length];


        for (int i = arr.length - 1, y = 0; i >= 0; i--, y++) {
            reverse[y] = arr[i];

        }
//        System.out.println(Arrays.toString(reverse));


        String s = "java";
        System.out.println(s.toCharArray());
        System.out.println(s);
        String str = "Today is Friday.";
        System.out.println( str.split(" "));
    }
}

