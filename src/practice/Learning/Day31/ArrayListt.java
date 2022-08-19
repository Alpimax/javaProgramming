package practice.Learning.Day31;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        System.out.println(name);
        name.add("String");
        name.add("odd");
        name.add("people");
        name.add("new");
        name.add("year");
        name.add("String");
        name.add("String");

        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.get(3));

    }
}
