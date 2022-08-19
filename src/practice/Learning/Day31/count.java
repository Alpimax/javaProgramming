package practice.Learning.Day31;

import java.util.Arrays;

public class count {


    public static void main(String[] args) {

        int [] numbers = {1,81,124,6,12,1,6,36,363,242,10};
        Arrays.sort(numbers);
        int [] newNumber = new int[numbers.length];
        int  j = numbers.length -1;
        int k=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 == 1){
                newNumber[k]= numbers[i];
                k++;
            }else {
                newNumber[j] = numbers[i];
                j--;
            }
        }

        System.out.println(Arrays.toString(newNumber));
    }
}
