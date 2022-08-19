package practice.Homework;

public class AverageNumber {
    public static void main(String[] args) {
        int score1 = 2300;
        int score2 = 1235;
        int score3 = 9043;
        int score4 = 3582;
        int giveScore = 4;
        int scoreTotal = score1 + score2 + score3 + score4;
        int scoreAverage = scoreTotal / giveScore;
        System.out.println("There are " + giveScore+ " number for average : " + scoreAverage );
    }
}
