package practice.Learning.Day37.Student;

import java.util.Arrays;

public class CydeoStudent {


    String name;
    String city;
    int group;

    static int batchNumber;
    static String schoolName;
    static String[] instructors; // static means one copy, belongs to class, all object share. Strign [] type.

    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        instructors = new String[]{"Adam", "Asya", "Saim"};

    }

    public CydeoStudent(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
    }

    public static void schoolInfo() {
        System.out.println(schoolName +"Batch "+ batchNumber);
        System.out.println("Instructors : " + Arrays.toString(instructors));
    }




    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
