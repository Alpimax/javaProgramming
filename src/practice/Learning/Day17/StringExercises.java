package practice.Learning.Day17;

public class StringExercises {
    public static void main(String[] args) {


        String name1 = "James Bond"; // nextLine()
        String name2 = "Jamie Bond"; // nextLine()

        int indexOfSpace = name1.lastIndexOf(' ');
        String lastName = name1.substring(indexOfSpace + 1); // name1.substring(indexOfSpace).trim();

        if (name2.endsWith(lastName)) {
            System.out.println("Related");
        } else {
            System.out.println("Not Related");
        }

        System.out.println(name2.endsWith(lastName) ? "Related" : "Not Related");


    }

}

