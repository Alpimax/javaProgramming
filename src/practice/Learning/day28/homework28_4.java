package practice.Learning.day28;

import java.util.Scanner;

public class homework28_4 {

public static String firstWord(String name){
      name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

    return name;

}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println(firstWord(name));
    }
}
