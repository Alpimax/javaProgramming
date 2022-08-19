package practice.Learning.Day24;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        int[] numbers = {1,132,12312,14514,23,123,124,124,12415,1};
        String str6 = "Today is Friday. Have a good weekend!";
        String[] words = str6.split(" ");
        String reverse = "";

        for (String each : words){
            System.out.println(each);
            String eachReverse = "";
            for (int i =each.length()-1; i>=0;i--){
                eachReverse+= each;
            }

        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }
}
