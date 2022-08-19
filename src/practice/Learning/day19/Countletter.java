package practice.Learning.day19;

public class Countletter {
    public static void main(String[] args) {
        // frequency of letter in word

        // word--> java
        // how many 'a' chars?

        String word = "javaaaaaaaaa";
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a'){
                count++;

            }
        }
        System.out.println(count);
    }
}
