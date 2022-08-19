package practice.Learning.Day31;

import java.util.ArrayList;

public class ArraylistExercises {


    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<Character>();

        // Size additional elements from the ArrayList
        System.out.println(letters.size());


        // Add additional elements from the ArrayList
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('a');

        System.out.println(letters.size());

        System.out.println(letters);

        // Get reading elements from the ArrayList
        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));

        letters.add(0, '$');
        System.out.println(letters);
        System.out.println(letters.get(1));

        letters.add(3, '8');
        System.out.println(letters);
    }
}
