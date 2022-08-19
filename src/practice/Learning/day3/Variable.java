package practice.Learning.day3;

public class Variable {
    public static void main(String[] args) {
        byte age;   // declared a byte variable that is called age
        age = 10;   // assigning 10 to the age variable

        System.out.println(age);  // Printing the age variable, which means I will print the value of the variable
        System.out.println("age");// This prints the character age, not the variable that has a number value
        System.out.println("20"); // Printing the character 2 and 0
        System.out.println(20 );  // Printing the int 20
        System.out.println(age + 1); // Age value is 10, then it adds 10 + 1 and prints 11

        // byte num = 200; 200 is too big for byte types
        short num = 200; // declared and assigned at the same time

    }
}
