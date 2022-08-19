package practice.Learning.Day23;

public class Average {
    public static void main(String[] args) {
        double[] prices = {13.99, 19.14, 3.122, 65.231};
        double sum = 0;
        for (double price : prices) {
            sum += price;

        }
        System.out.println(sum / prices.length);
    }
}
