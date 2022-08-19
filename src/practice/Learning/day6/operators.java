package practice.Learning.day6;

public class operators {
    public static void main(String[] args) {
        int age = 40;
        long ageLong = age;
        System.out.println(ageLong);
        long num = 100;
        int numInt =(int) num;
        System.out.println(numInt);
        int n = 0 ;
        n++;
        System.out.println(n);
        ++n; // pre increment, value becomes 3, then it prints the value.
        System.out.println(n);
        n++; // post increment,
        n++;
        System.out.println(n);
        int i = 10;
        System.out.println(++n);
        int x = 4;
        int y = x;
        int z = x++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
