package practice.Learning.Day24;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello world";
        char[] letters = s.toCharArray();
        System.out.println(letters);
        System.out.println(Arrays.toString(letters));
        System.out.println(s.length());
        System.out.println(letters.length);

        for (char eachLetter : s.toCharArray()) {  // letters come from String.
            System.out.println(eachLetter);
        }
        for (char each2Letter : letters) { // letters call from Array.
            System.out.println(each2Letter);
        }

        String str = "Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday";
        System.out.println(Arrays.toString(str.split(",")));
        for (String eachDay : str.split(","))
            System.out.println(eachDay);
        String str2 = "jan-feb-mar-apr-may-jun-aug-sep";
        String[] months = str2.split("-");
        System.out.println(Arrays.toString(months));


        String str4 = "java";
        System.out.println(Arrays.toString(str4.toCharArray())); // char []
        System.out.println(Arrays.toString(str4.split("")));// String []

        String str5 = "Alper,Atilla,Pakizer,Maarif";
        String[] family = str5.split(",");
        System.out.println(Arrays.toString(family));

        String str6 = "Today is Friday. Have a good weekend!";
        String[] words = str6.split(" ");
        String reverse = "";

        for (int k = words.length-1; k >= 0; k--) {
            reverse += words[k]+ " ";
        }
        System.out.println(reverse.trim());
    }

}
