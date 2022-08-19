package practice.Learning.my_utils.replit;

import java.util.ArrayList;

public class Module {


    // Finish the Module class
    String name;
    ArrayList<File> files;

    public Module(String name) {

        this.name = name;


    }

    public Module(String name, ArrayList<File> files) {
        this(name);
        this.files = files;

    }

    public void addFile(File empty) {
        files.add(empty);

    }


    public void removeFile(File full) {
        files.removeIf(p -> (p.name.equals(full.name) && p.size == full.size));
    }

    @Override
    public String toString() {
        return name +
                "Files: " + files;
    }


}
