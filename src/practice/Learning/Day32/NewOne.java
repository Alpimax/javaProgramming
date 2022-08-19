package practice.Learning.Day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NewOne {
    public static void main(String[] args) {

        //Separate Parts
        //
        //Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
        //
        //Ex:
        String str = "ABCduvauohvaou%$%$&#&%$&><>?<>}|}}{*hD123$#@&456EFG!";
        //list1: {$, %, #, @, &, !}
        //list2: {A, B, C, D, E, F, G}
        //list3: {1, 2, 3, 4, 5, 6}

        // String[] name = str.split("");

        // System.out.println(Arrays.toString(name));
        ArrayList<String> findStr = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(findStr);
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();
        ArrayList<Character> list4 = new ArrayList<>();


        for (int i = 0; i < findStr.size(); i++) {
            Character letter = str.charAt(i);
            if (Character.isDigit(letter)) {
                list1.add(letter);
            } else if (Character.isUpperCase(letter)) {
                list2.add(letter);
            } else if (Character.isLowerCase(letter)) {
                list4.add(letter);
            } else
                list3.add(letter);
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}



