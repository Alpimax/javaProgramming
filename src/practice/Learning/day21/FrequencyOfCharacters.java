package practice.Learning.day21;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "javaaaaaavvvvvvavavava";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (checked.contains(("" + str.charAt(i)))) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " - " + count);
            checked += str.charAt(i);
        }
    }
}