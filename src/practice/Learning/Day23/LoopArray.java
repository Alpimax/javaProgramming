package practice.Learning.Day23;

import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {
        int[] nums = {6, 23, 5, 342};
        System.out.println(Arrays.toString(nums));
        System.out.println("This is hardcoded part.");

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        System.out.println("----------------------------");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        String name = "Array : ";
        for (int j = 0; j < nums.length; j++) {
            name += nums[j] + " | ";

        }
        name += " End.";

        System.out.println("--------------------");
        System.out.println(name);
        for (int eachNumber : nums)
            System.out.println(eachNumber);
    }
}