package practice.Learning.Day24;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {10, 0, 9, 2, 0, 1, 0};
        int[] fixed = new int[nums.length];
        int indexToRead = 0;
        int indexToStore = 0;

        while (indexToRead < nums.length) {

            if (nums[indexToRead] != 0){
                fixed[indexToStore] = nums[indexToRead];
                indexToStore++;
            }
            indexToRead++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(fixed));
    }
}
