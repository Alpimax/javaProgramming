package practice.Learning.Day29;

public class VarArgEx {
    public static void printAll(int[] nums) {
        for (int each : nums) {
            System.out.print(each + "");
        }
    }

    public static void dynamic(int... nums) {
        for (int each : nums) {
            System.out.print(each + "");
        }
    }

    public static void dynamic(String... words) {
        for (String each : words) {
            each.length();
            System.out.println(each + " ");
        }
    }


    public static void main(String[] args) {
        int[] a = {3, 1, 3, 6, 6};
        printAll(a);
        System.out.println();
        dynamic(5, 2, 4, 26, 6, 7);

        dynamic("hello","how are you","today","java","day");

    }
}