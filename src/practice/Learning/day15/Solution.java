package practice.Learning.day15;

public class Solution {
    public static void main(String[] args) {
        // equal(): checks if the String are the same characters, but ignores case sensitivite
        //returns boolean

        //equalsIgnoreCase():checks
        String first = "Testing";
        first = first.toLowerCase();
        System.out.println(first);

        String second = "SOLF SKILLS";
        String lowerSecond = second.toLowerCase();
        System.out.println(second);
        System.out.println(lowerSecond);

        String third = "       Hello word";
        System.out.println(third.length());
        System.out.println(third);
        third = third.trim();
        System.out.println(third.length());
        System.out.println(third);

        String str = "Today it is 80 degrees";
        System.out.println(str);
        System.out.println("str.contains (Today)"+str.contains("Today"));
        System.out.println("str.contains (it is)"+str.contains("it is"));
        System.out.println("str.contains (degrees)"+str.contains("degrees"));
        System.out.println("str.contains (today)"+str.contains("go"));



    }
}
