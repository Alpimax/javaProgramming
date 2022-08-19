package practice.Learning.Day30;

public class WrapperClassExamples {
    public static void main(String[] args) {

        byte b = 9;
        Byte b2 = 23;

        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLetter('o'));


        String s= "1234";
        System.out.println(s+5);//concatenation


    }
}
