package practice.Learning.Day35.School;

public class School {

    String name;
    int totalNumberOfStudent;
    double avgGpa;


    public School(String name, int totalNumberOfStudent, double avgGpa) {
        this.name = name;
        this.totalNumberOfStudent = totalNumberOfStudent;
        this.avgGpa = avgGpa;
    }

    public String toString() {
        return "School   = {" +
                "\n name='" + name + '\'' +
                ",\n totalNumberOfStudent=" + totalNumberOfStudent +
                ",\n avgGpa=" + avgGpa +
                "\n}";
    }
}
