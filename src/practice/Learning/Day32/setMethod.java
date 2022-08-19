package practice.Learning.Day32;

import java.util.ArrayList;
import java.util.Arrays;

public class setMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(9);
        list.add(41);
        list.add(8);
        list.add(12);
        list.add(542);
        System.out.println(list);


        list.set(2, 10);
        System.out.println(list);

        list.set (0,2);
        System.out.println(list);

        ArrayList<String> strs = new ArrayList<String>();
        strs.add("friday");
        strs.add("off");
        strs.add("study");
        strs.add("relax");
        System.out.println(strs);


    }
}
