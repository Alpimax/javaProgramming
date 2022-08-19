package practice.Learning.Day35.HomeWork;


import java.util.Arrays;

class CallSongTest {

    public int maxTriple(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length -1];
    }

}