package practice.Learning.Day31;

import java.util.ArrayList;

public class Day31 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);

        words.remove(2);
        System.out.println(words);

        System.out.println(words.remove(0));
        System.out.println(words);
        words.clear();
        System.out.println(words);
        String name = "";
        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);

        System.out.println(words.remove("barn"));
        System.out.println(words);


    }
}
