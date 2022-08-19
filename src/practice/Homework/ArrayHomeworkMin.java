package practice.Homework;

import practice.youtube.array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayHomeworkMin {
    public static void main(String[] args) {

//        Given a 2D int array merge the elements into one 1D practice.youtube.array

//        Ex
        int[][] nums = {
                {4, 1, 24, 5, 16},
                {24, 1, 2, 5,},
                {4, 1, 5, 1, 16}

        };

        int[] arr1 = nums[0];
        Arrays.sort(arr1);
        int[] arr2 = nums[1];
        Arrays.sort(arr2);
        int[] arr3 = nums[2];
        Arrays.sort(arr3);
        String str1 = "";

        for (int i = 0; i < arr1.length; i++) {
            int result1 = Arrays.binarySearch(arr2,arr1[i]);
            int result2 = Arrays.binarySearch(arr3,arr1[i]);
            if (result2>=0  && result1>=0 ){
                str1 += arr1[i] + " ";
            }
        }

        int n  = 5;

        double result = (double)n;

        System.out.println(str1.trim());
    }

}
