package practice.Learning.day28;

import java.util.Scanner;

public class homework28_5 {
    public static String camelCase(String sentence) {

        String[] splitSentence = sentence.split(" ");
        String camelCaseSentence = splitSentence[0].toLowerCase();
        for (int i = 1; i < splitSentence.length; i++)
            camelCaseSentence += splitSentence[i].trim().substring(0, 1).toUpperCase() + splitSentence[i].trim().toLowerCase().substring(1);

        return camelCaseSentence;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String camelCaseSentece = input.nextLine();

        System.out.println(camelCase(camelCaseSentece));
    }


}


