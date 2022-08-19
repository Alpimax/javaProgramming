package practice.Learning.Day32;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWithValues {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 1};

        Arrays.asList(arr);
        System.out.println(Arrays.toString(arr));


        Integer[] arr2 = {3,5,6,7,9,5};
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(arr2));
        System.out.println(nums);


        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5,2,4,5,1,4));

        System.out.println(list);

        ArrayList<String> name = new ArrayList<String>();



    }
}
