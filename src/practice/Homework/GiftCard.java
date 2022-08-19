package practice.Homework;

public class GiftCard {
    public static void main(String[] args) {
        int giftCardVar = 500;
        int timeUse = 3;
        int spendMoney = 150;
        int firstResult = giftCardVar -spendMoney;
        System.out.println("Gift Card  = " + firstResult);
        timeUse -= 1 ;
        System.out.println("timeUse = " + timeUse);
        spendMoney = 99;
        System.out.println("Gift Card  = " + (firstResult - spendMoney));
        timeUse -= 1 ;
        System.out.println("timeUse = " + timeUse);


        int a = 8;
        int b = a--;
        System.out.println(a);
        System.out.println(b);

    }
}
