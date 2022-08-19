package practice.Learning.day6;

public class CharIncrement {
    public static void main(String[] args) {
        char letter = 'A';

        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter);

        char letter2 = 'a';
        System.out.println(++letter2); // pre increment, so the 1 is added first, then expression finishes.
        System.out.println(++letter2);
        System.out.println(++letter2);

        char digits = 9;
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
    }
}
