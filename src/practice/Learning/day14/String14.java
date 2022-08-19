package practice.Learning.day14;

public class String14 {
    public static void main(String[] args) {
        System.out.println();
        String username = "jamesbond";
        String password = "BOND007";

        System.out.println(username.equals("JAMESBOND"));
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));
        System.out.println(password.equals("BOND007"));


        System.out.println("________________________");
        String day = "Tuesday";
        System.out.println(day.length());
        String day2 = "Friday";
        int len = day2.length();
        System.out.println(len);
        String str = "Hello "; // The character 'hello' are 5 long but spaces are also character, so the space in the beginning and end are included, which means the total length is 7
        System.out.println(str.length());// prints how many characters the String has
        System.out.println("________________________");

        String word = "Summer";
        word = word.toUpperCase();
        System.out.println(word.toUpperCase());

        System.out.println("________________________");
        String sentence = "hello My name is";
        System.out.println(sentence.toUpperCase());

        System.out.println("________________________");

        String alper = "      a   lper";
        System.out.println(alper.equals(alper));
        System.out.println(alper.length());
        System.out.println(alper.equalsIgnoreCase(alper));
        System.out.println(alper.toUpperCase());
        System.out.println(alper.toLowerCase());
        System.out.println(alper.trim());





    }
}
