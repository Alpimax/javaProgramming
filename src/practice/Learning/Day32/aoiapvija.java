package practice.Learning.Day32;

import java.util.ArrayList;
import java.util.Arrays;

public class aoiapvija {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("one","hi","hold","Alper"));

        System.out.println(words);


        for (int i = 0; i < words.size(); i++) {
            String name = "";
            for (int j = 0; j < words.get(i).length(); j++) {
                name += "*";
            }
            words.remove(i);
            words.add(i,name);
        }

        System.out.println(words);
    }
}

