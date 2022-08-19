package practice.Learning.Day32;

import java.util.ArrayList;

public class avengers {
    public static void main(String[] args) {
        ArrayList<String> aveng = new ArrayList<String>();

        aveng.add("Iron Man");
        aveng.add("Spider Man");
        aveng.add("Thor");
        aveng.add("Captain America");
        aveng.add("Hawkeve");

        System.out.println(aveng);
        int indexOfThor = aveng.indexOf("Thor");
        System.out.println(indexOfThor);


        aveng.remove(indexOfThor); //romeve (2) -> but more dynamic.
        System.out.println(aveng);

        aveng.remove("Iron Man");
        System.out.println(aveng);
        aveng.remove(0);
        System.out.println(aveng);

    }
}
