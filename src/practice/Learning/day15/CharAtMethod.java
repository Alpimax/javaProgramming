package practice.Learning.day15;

public class CharAtMethod {
    public static void main(String[] args) {
        String s = "java";
        //          0123

        System.out.println("First char  :" + s.charAt(0));
        System.out.println("Second char :" + s.charAt(1));
        System.out.println("Third char  :" + s.charAt(2));
        System.out.println("Fourth char :" + s.charAt(3));

        System.out.println("Length "+ s.length());
        System.out.println("Length "+ 3);
        System.out.println("Length "+ s.charAt(s.length()-1));
        System.out.println();


        System.out.println(s.concat(" Alper"));
    }
}
