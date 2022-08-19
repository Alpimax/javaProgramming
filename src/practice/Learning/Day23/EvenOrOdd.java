package practice.Learning.Day23;

import java.util.Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        String stringOdd ="";
        String stringEven ="";

        int[] nums = {3, 5, 3, 25, 6, 57, 45, 35, 725, 345, 39, 4352371, 12, 12, 12,};
        System.out.println(Arrays.toString(nums));
        for (int each : nums) {
            if (each % 2 == 0) {
                even++;
                stringEven += each +" ,";
            } else {
                odd++;
                stringOdd += each +" ,";
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
        System.out.println("stringOdd = " + stringOdd);
        System.out.println("stringEven = " + stringEven);
    }
}
