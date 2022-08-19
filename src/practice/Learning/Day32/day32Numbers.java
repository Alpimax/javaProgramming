package practice.Learning.Day32;

import java.util.ArrayList;

public class day32Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();


        nums.add(800);
        nums.add(300);
        nums.add(400);
        nums.add(300);
        nums.add(500);
        System.out.println(nums);

        //nums.remove(300); the 300 is an int here, so it is trying to remove index 300
        nums.remove((Integer) 300 );
        System.out.println(nums);



    }
}
