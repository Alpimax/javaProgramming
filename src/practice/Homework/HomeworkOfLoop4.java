package practice.Homework;

public class HomeworkOfLoop4 {
    public static void main(String[] args) {
        int num = 7;

        for (int i = num; i >= 1; i--) {
            int v1 = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(v1 + " ");
                v1++;
            }
            System.out.println();
        }
        for (int i = 2; i <= num; i++) {
            int v1 = 1;
            System.out.print(v1 + " ");
            for (int j = 2; j <= i; j++) {
                v1++;
                System.out.print(v1 + " ");
            }
            System.out.println();
        }
    }
}
