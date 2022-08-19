package practice.Learning.day21;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int i = 20; i > 0; i--) {
            for (int j = 20; j > i; j--) {
                System.out.print("$");
            }
            System.out.println();
        }


    }
}
