package practice.Homework;

public class Titlee {
    public static void main(String[] args) {

        String name = "Mr james";

        name = name.toLowerCase();
        if (name.startsWith("mr") || name.startsWith("mister")) {
            System.out.println("Hello Sir");
        } else if (name.startsWith("ms") || name.startsWith("miss") || name.startsWith("madam")) {
            System.out.println("Hello ma'am");
        } else if (name.startsWith("dr")) {
            System.out.println("Hello Doctor");
        }
    }
}
//methots :
    //charAt (int): returns the character at the given int number (index)

        // s.chartAt(0) ---> f
        // s.chartAt(0) ---> u
        // s.chartAt(0) ---> n
    // indexOf(): return  an int (index) where the given character/s is located in the String
        // ==> if the character does not exist in the String -1 is return

        // String str = "java";
        //(char): give a char in parenthesis and it returns the index where that character is found.

        //