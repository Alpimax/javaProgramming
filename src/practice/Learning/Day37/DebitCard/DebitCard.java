package practice.Learning.Day37.DebitCard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DebitCard {
    //   card number (long), holder name (String), card type (String), pin (int), and balance (double)
    long cardNumber;
    String holderName, cardType;
    int pin;
    double balance;
    Debit debit;


    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        if (String.valueOf(cardNumber).length() == 16) {
            this.cardNumber = cardNumber;
        } else
            System.out.println("Invalid card number");

        this.holderName = holderName;

        this.cardType = cardType;

        if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else
            System.out.println("Invalid pin length");

        this.balance = balance;


    }


    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        String[] strings = {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"};
        wordAppend(strings);
    }

    public static void wordAppend(String[] strings) {
        Map<String, String> map = new HashMap<>();
        String name = "";

       for (String each : strings) {
            if(!map.containsKey(each)){
                map.put(each,each);
            }else{

                name += map.get(each);
                map.remove(each);
            }
        }

        System.out.println(name);
//        wordAppend(["a", "b", "a", "c", "a", "d", "a"]) →"aa"


    }
    public int[] withoutTen(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != 10){
                arr[i]= nums[i];

            }
        }return nums;

    }

}
