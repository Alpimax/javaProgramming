package practice.Udemy;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner trafficLight = new Scanner(System.in);
        System.out.println("Please enter the color of the traffic light:");
        String insertedColor = trafficLight.nextLine();
        if(insertedColor.equalsIgnoreCase("red")){
            System.out.println("We are waiting...");
        }else if (insertedColor.equalsIgnoreCase("yellow")){
            System.out.println("We are careful...");
        }else if (insertedColor.equalsIgnoreCase("yellow")){
            System.out.println("We can cross the street...");
        }else {
            System.out.println("You did not enter a valid traffic light color.");

        }
    }
}
