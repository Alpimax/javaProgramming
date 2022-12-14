package practice.Learning.Day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("cat", "dog"));
        System.out.println(list);
        System.out.println(switchPairs(list));
        System.out.println(switchPairs2(list));


    }

    public static ArrayList<String> switchPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
        return list;
    }

    public static ArrayList<String> switchPairs2(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            Collections.swap(list,i,i+1);
        }
        return list;
    }
}
