package practice.Learning.day28;

import practice.Learning.day19.Palindrome;

public class homework28 {

//    create a method that will that will accept a String and find if it is Palindrome or not (boolean)

    public static boolean palindrome(String word) {
        boolean istrue = false;
        String reserveWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reserveWord += "" + word.charAt(i);
            if (reserveWord.equalsIgnoreCase(word)){
                istrue =true;
            }
        }
        return istrue;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("Asddsa"));

    }
}

