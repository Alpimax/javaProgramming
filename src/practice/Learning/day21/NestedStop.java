package practice.Learning.day21;

public class NestedStop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + "" + j);
                for (int k = 0;k < 10 ;k++){
                    System.out.print("x");
                }


            }
        }

    }
}
