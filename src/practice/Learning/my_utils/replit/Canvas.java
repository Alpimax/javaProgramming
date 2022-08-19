package practice.Learning.my_utils.replit;

import java.util.ArrayList;

public class Canvas {


// Finish the Canvas class

    String topic;

    ArrayList<Quiz> quizzes ;
    ArrayList<Module> modules ;

    public Canvas(String topic) {
        this.topic = topic;

    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this(topic);
        this.quizzes = quizzes;
        this.modules = modules;
    }

    public String toString() {
        return topic + " name " +
                "Quizzes:" + quizzes +
                "Modules:" + modules;
    }


}

