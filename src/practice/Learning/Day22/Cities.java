package practice.Learning.Day22;

import java.util.Arrays;

public class Cities {
    public static void main(String[] args) {
        String city1 = "Chicago";
        String city2 = "West Palm";
        String city3 = "Miami";
        String city4 = "New York";
        String city5 = "Toronto";
        String city6 = "Houston";

        String[] cities = {"Chicago", "West Palm", "Miami", "New York", "Toronto", "Houston" };

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);

        System.out.println("-------------------------------------");
        for (int i = 0; i < cities.length ; i++){
            System.out.println(cities[i]);
        }
        System.out.println("-------------------------------------");
        System.out.println(Arrays.toString(cities));
    }
}
