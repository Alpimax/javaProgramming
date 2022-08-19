package practice.Udemy;

public class Operators {
    public static void main(String[] args) {
        // Mathamatical Operators
        // + / - * %

        System.out.println( 10 + 10 );
        System.out.println( 10 / 10 );
        System.out.println( 10 - 10 );
        System.out.println( 10 * 10 );
        System.out.println( 10 % 10 );

        // relational Operators
        System.out.println( 10 == 10 );
        System.out.println( 10 != 10 );
        System.out.println( 5 + 5 >= 10);
        System.out.println( 5 + 5 + 5 <= 10);

        // logical operators
        System.out.println( 5 < 6 && 9 < 8);
        System.out.println(5 < 6 || 9 < 8);

        // assignment operators
        int number = 5 ;
        number++;
        number++;
        number++;
        System.out.println(number);

        int Number2 = 8;
        Number2--;
        Number2--;
        System.out.println(Number2);

        int My_number = 80;
        My_number+=8;
        System.out.println(My_number);
        My_number*=8;
        System.out.println(My_number);



    }
}
