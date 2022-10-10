package practice.Homework;

public class triangleShape {
    public static void main(String[] args) {


        int number = 6232416;
        int count = 0;
        int total = 0;
        int value;
        int temp = number;

        while (temp > 0) {
            temp /= 10;
            count++;
        }
        System.out.println(count);
        System.out.println(temp);
        temp = number;
        while (temp > 0) {
            value = temp % 10;
            total += Math.pow(value, count);
            temp /= 10;
        }
        System.out.println(number == total ? "this is Armstrong. " : "this is not Armstrong.");
        System.out.println("isArmstrongNum(6232416) = " + isArmstrongNum(6232416));
    }
    public static boolean isArmstrongNum(int num){
        String[] nums = String.valueOf(num).split("");
        int digit = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.pow(Integer.parseInt(nums[i]),digit);
        }
        return sum == num;
    }


}
