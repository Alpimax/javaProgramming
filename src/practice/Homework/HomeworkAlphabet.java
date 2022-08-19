package practice.Homework;

public class HomeworkAlphabet {

    public static void fromAtoZ() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");

        }
    }

    public static void fromZtoA() {
        for (char c = 'Z'; c >= 'A'; c--)
            System.out.print(c + " ");
    }

    public static void fromatoz() {
        for (char c = 'a'; c <= 'z'; c++)
            System.out.print(c + " ");
    }

    public static void fromztoa() {
        for (char c = 'z'; c >= 'a'; c--) {
            System.out.print(c + " ");
        }
    }

    public static void number0to9() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
    }

    public static void space() {
        System.out.println();
    }

    public static void main(String[] args) {
        number0to9();
        space();
        fromztoa();
        space();
        fromatoz();
        space();
        fromZtoA();
        space();
        fromAtoZ();

    }
}

