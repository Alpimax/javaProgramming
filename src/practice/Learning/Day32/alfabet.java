package practice.Learning.Day32;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class alfabet {
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>();

        for (char i = 'a'; i <='z' ; i++) {
            letters.add(i);

        }
        letters.remove(letters.indexOf('a'));
        letters.remove((Character) 'e');
        letters.remove((Character) 'i');
        letters.remove((Character) 'o');
        letters.remove((Character) 'o');


        System.out.println(letters);
    }

}
