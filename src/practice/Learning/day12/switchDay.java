package practice.Learning.day12;

public class switchDay {
    public static void main(String[] args) {
        int day = 3; //number from 1 to 7, where 1 is Monday and 7 is Sunday.

        switch (day) {
            default: // acts like else, if no other case matches the default case will run
                System.out.println("Not a valid day number, should 1 to 7");
            case 1: // if( day == 1 )
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
