package practice.Learning.Day29;

import java.util.Arrays;

public class homework {

    public static int minNumber(int... numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static int maxnumber(int... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static boolean containsNum(int number, int... numbers) {

        for (int each : numbers) {
            if (number == each) {
                return true;
            }
        }
        return false;
    }

    public static int idexOfNumber(int number, int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return number;
    }

    public static String[] addString(String add, String... arr) {
//create a method that will accept a String array and a String element.
// Add the given element value into the end of the array.
// Do not replace the last index of the given array, but instead create a new array with a bigger size to fit all the original elements plus the new one
        String[] addString = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            addString[i] = arr[i];
        }
        addString[arr.length -1] = add;
        return addString;
    }
}