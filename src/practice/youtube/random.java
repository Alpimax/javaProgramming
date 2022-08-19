package practice.youtube;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(20)+1;
        System.out.println("x = " + x);
    }
}
