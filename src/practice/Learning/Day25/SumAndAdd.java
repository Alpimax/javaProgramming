package practice.Learning.Day25;

import java.util.Arrays;

public class SumAndAdd {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2};
        int sum = 0;

        for (int each : arr) {
            sum += each;

        }
        System.out.println(sum);
        int[] newarr = Arrays.copyOf(arr, arr.length + 1);
        System.out.println(Arrays.toString(newarr));

    }
}
