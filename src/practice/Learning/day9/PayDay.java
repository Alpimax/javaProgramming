package practice.Learning.day9;

public class PayDay {
    public static void main(String[] args) {
        double hourlyRate = 60;
        int hoursPerWeek = 50;
        double netPay;

        if (hoursPerWeek > 40) {
            // Overtime calculation
            int overTimeHours = hoursPerWeek - 40;
            netPay = hourlyRate * 40;
            netPay += hourlyRate * overTimeHours * 1.5;
        } else {
            netPay = hoursPerWeek * hourlyRate;
        }

        System.out.println("netPay = " + netPay);
    }
}