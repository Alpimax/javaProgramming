package practice.Learning.my_utils.replit;

import java.util.ArrayList;

public class sample {
    public static ArrayList<Quiz> easyQuizzes() {
        ArrayList<Quiz> quizzes = new ArrayList<>();
        quizzes.add(new Quiz("If statement", 10, 10));
        quizzes.add(new Quiz("String", 8, 8));
        quizzes.add(new Quiz("Loops", 12, 15));
        return quizzes;
    }

    public static void main(String[] args) {
        easyQuizzes();
        easyQuizzes();
        easyQuizzes();
        easyQuizzes();
       System.out.println(easyQuizzes().get(0));
    }
}
