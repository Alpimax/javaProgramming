package practice.Learning.Day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyMethod {

    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a', 'e', 'e', 'a', 'e', 't', 'p', 'i', 'o', 'o'));

        System.out.println(Collections.frequency(letters,'e'));
        System.out.println(Collections.frequency(letters,'a'));
        System.out.println(Collections.frequency(letters,'o'));
        System.out.println(Collections.frequency(letters,'z'));
        System.out.println(Collections.frequency(letters,'E'));

        String s = "aaaabbbbabeiffca";

        ArrayList<String> list = new ArrayList<>(Arrays. asList(s.split("")));
        System.out.println(list);
        System.out.println(Collections.frequency(list,"a"));


    }
}
