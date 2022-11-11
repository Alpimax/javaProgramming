package practice.Learning.Day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BestBuy {

    String location;
    static String headquarters = "Richfield, Minnesota";






    public static void main(String[] args) {
        System.out.println(Arrays.toString(zerosEnd(new int[]{1, 23, 51, 52, 252, 0, 0, 6355, 9, 0, 0, 4, 7, 5, 2})));
        System.out.println(Arrays.toString(conCat(new int[]{1, 23, 51, 52}, new int[]{5, 21, 4, 5, 2})));
        oddEven(22);
        Random random = new Random();
        var number = random.ints(1);
        System.out.println(number);
    }





    public static int[] zerosEnd(int[] arr) {

        int[] arr2 = new int[arr.length];


        int index = 0;
        for (int j : arr) {
            if (j != 0) {
                arr2[index++] = j;
            }
        }
        return arr2;
    }

//    public static int[] unuiqSum(int n) {
////        Q13: Write a function:
////that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
//// The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
//// The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
//// (but there are many more correct answers).
//
////        Random random = new Random();
////        int[] array = new int[n];
////    random.ints(0,20,)
////        x + y + z = p;
////        -(p) = -x - y - z;
//
//    }

    public static int[] conCat(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        var index = 0;
        for (int j = a.length; j < arr.length; j++) {
            arr[j] = b[index++];
        }
        return arr;


    }

    public static void oddEven(int n) {
        System.out.println(n % 2 == 0 ? "identify(" + n + ") -> \"Even\"" : "identify(" + n + ") -> \"Odd\"");
    }

}

