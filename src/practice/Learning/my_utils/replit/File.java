package practice.Learning.my_utils.replit;

public class File {

    // Finish the File class
     String  name;
     double size;

    public  File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public void openFile() {
        System.out.println("Opening " + name);
    }

    public String toString() {
        return "File |"+ name + size+ " mb";
    }
}
