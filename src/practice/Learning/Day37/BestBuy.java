package practice.Learning.Day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestBuy {

    String location;
    static String headquarters = "Richfield, Minnesota";


    public static void main(String[] args) {
        System.out.println(Arrays.toString(zerosEnd(new int[] {1,23,51,52,252,0,0,6355,9,0,0,4,7,5,2})));
    }

    public static int[] zerosEnd(int[] arr) {

        int[] arr2 = new int[arr.length];
        int countZero = arr.length -1;
        int index = 0;
            for (int j : arr) {
                if (j != 0) {
                    arr2[index++] = j;
                } else {
                    arr2[countZero--] = j;
                }
            }
        return arr2;
    }
}
