package practice.Homework;

import java.util.HashMap;
import java.util.Map;

public class triangleShape {
    public static void main(String[] args) {
        System.out.println(check(same("isa"), same("saa")));
        System.out.println(reverse("DC501GCCCA098911"));
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(beforeUsedMem);
        System.out.println(afterUsedMem);

//        int number = 6232416;
//        int count = 0;
//        int total = 0;
//        int value;
//        int temp = number;
//
//        while (temp > 0) {
//            temp /= 10;
//            count++;
//        }
//        System.out.println(count);
//        System.out.println(temp);
//        temp = number;
//        while (temp > 0) {
//            value = temp % 10;
//            total += Math.pow(value, count);
//            temp /= 10;
//        }
//        System.out.println(number == total ? "this is Armstrong. " : "this is not Armstrong.");
//        System.out.println("isArmstrongNum(6232416) = " + isArmstrongNum(6232416));
    }


    public static boolean isArmstrongNum(int num) {
        String[] nums = String.valueOf(num).split("");
        int digit = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.pow(Integer.parseInt(nums[i]), digit);
        }
        return sum == num;
    }


//    Q2:Write a return method that check if a string is build out of the same letters as another string.
//
//Ex:  same("abc",  "cab"); -> true
//
//same("abc",  "abb"); -> false

    public static Map<String, Integer> same(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey("" + str.charAt(i)))
                map.put("" + str.charAt(i), 1);
            else
                map.put("" + str.charAt(i), map.get("" + str.charAt(i)) + 1);

        }
        return map;
    }

    public static boolean check(Map<String, Integer> map, Map<String, Integer> map2) {

        return map.equals(map2);

    }

    public static String reverse(String str) {
        String reverse = "";
        boolean number = false;
        boolean alpha = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number = true;
                alpha = false;
            } else {
                number = false;
                alpha = true;
            }
            if (alpha) {
                reverse += reverse;
            }


        }

        return reverse;
    }

    public static String sameletters(String str,String str2) {


    return "";
    }
}





