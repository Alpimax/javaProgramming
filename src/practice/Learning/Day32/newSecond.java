package practice.Learning.Day32;

import java.util.ArrayList;

public class newSecond {

    public static void main(String[] args) {


        ArrayList<String> name = new ArrayList<>();

        name.add("cat");
        name.add("in");
        name.add("the");
        name.add("hat");
        System.out.println(name);

        name.remove(2);
        System.out.println(name);

        name.add("the");
        System.out.println(name);

        name.set(0, "in");
        System.out.println(name);

        name.add("cat");
        System.out.println(name);

        name.add(0,"in");
        System.out.println(name);

    }
}
