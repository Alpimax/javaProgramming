package practice.Learning.day12;

public class SoccerGame {
    public static void main(String[] args) {
        int minutes = 90;
        if (minutes >= 0 && minutes <= 90) {
            // valid time
            if (minutes >= 75) {
                System.out.println("just getting started");
            } else if (minutes >= 60) {
                System.out.println("players are doing their best");
            } else if (minutes >= 30) {
                System.out.println("Middle of the game is going great");
            } else {
                System.out.println("The end of the same is approaching");
            }

        } else {
            if (minutes > 0) {
                System.out.println("minutes cannot be a negative number.");
            } else {
                System.out.println("Games cannot be longer than 90 minutes");
            }
        }
    }}
