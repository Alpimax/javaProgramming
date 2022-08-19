package practice.Learning.day5;

public class withsmaller {
    public static void main(String[] args) {
        byte b1 = 5;
        byte b2 = 4;
        System.out.println( b1 +b2 );
        // byte b3 = b2 + b1 during the calculation the values are turned to int so the result is int
        // solutions :
        int i = b1 + b2 ;
        byte b3 =(byte) (b1 +b2 );

        int a = 10;

        System.out.println( a + 20 );
        System.out.println(a);
    }
}
