package practice.Learning.day8;
import java.util.Scanner;
public class HomeworkScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1= new Scanner(System.in);
        int number, number2, number3, number4, number5;
        String string, string2, string3, string4, string5;

        System.out.println("number ");
        number  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Alphabet");
        string  = scanner.nextLine();
        System.out.println("number ");
        number2 = scanner.nextInt();
        System.out.println("Alphabet");
        scanner.nextLine();
        string2 = scanner1.nextLine();
        System.out.println("Alphabet");
        string3 = scanner1.nextLine();
        System.out.println("number ");
        number3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Alphabet");
        string4 = scanner1.nextLine();
        System.out.println("number ");
        number4 = scanner.nextInt();
        System.out.println("Alphabet");
        scanner.nextLine();
        string5 = scanner1.nextLine();
        System.out.println("number ");
        number5 = scanner.nextInt();



    }
}