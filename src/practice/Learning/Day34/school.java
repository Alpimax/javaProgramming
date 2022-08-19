package practice.Learning.Day34;

public class school {
    public static void main(String[] args) {
        Student studentOne = new Student();

        System.out.println(studentOne);

        studentOne.name = "Olena";
        studentOne.batchNumber = 27;
        studentOne.program = "Sdet";
        studentOne.grade = 99.99;

        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);



    }
}
