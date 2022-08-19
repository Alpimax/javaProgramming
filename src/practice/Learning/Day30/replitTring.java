package practice.Learning.Day30;

import java.util.Scanner;

public class replitTring {
    public static void main(String[] args) {

        System.out.println(countLetters("aaabbcccc"));
    }

    public static String countLetters(String str){
        String result="";
        for(int i = 0 ;i<str.length();i++){
            int count= 0 ;
            for (int j = 0; j < str.length(); j++) {
                if( str.charAt(i)==str.charAt(j)){
                    count++;

                }
            }if (result.contains(""+str.charAt(i))){
                continue;
            }else
            result += "" + count + str.charAt(i);
        }

        return result;
    }
}
