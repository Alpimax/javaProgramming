package practice.Learning.day6;

public class driving {
    public static void main(String[] args) {

        int speed = 40;

        int speedLimit = 50;
        boolean legalLimit = speed < speedLimit;
        System.out.println("Legal Limit = " + legalLimit);


        int yourNumber = -42;

        boolean lessZero = yourNumber < 0;
        boolean graterZero = yourNumber > 0;
        boolean equalZero = yourNumber == 0;

        System.out.println("Less than Zero = " + lessZero);
        System.out.println("Greater then Zero = " + graterZero);
        System.out.println("Equal to Zero = " + equalZero);

        int numberFind = 354121;{
            if(numberFind % 2 == 1){
                System.out.println("This number is Odd");
            }else
                System.out.println("this number is even");
        }

        boolean isWeekend = true;
        boolean isGoodTemp = true;
        boolean doBbq = isGoodTemp && isWeekend;
        System.out.println("doBbq = " + doBbq);

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFirefighter = false;
        boolean getDiscount = isTeacher || isPolice || isFirefighter;



    }
}
