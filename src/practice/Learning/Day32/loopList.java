package practice.Learning.Day32;

import java.util.ArrayList;

public class loopList {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");

        }
        System.out.println();
        for (int each : nums) {
            System.out.print(each + " ");

        }


        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");

    }
}
