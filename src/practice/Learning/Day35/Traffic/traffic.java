package practice.Learning.Day35.Traffic;

import practice.Udemy.TrafficLight;

public class traffic {

    public static void main(String[] args) {

        trafficLight light = new trafficLight("green");
        // light.color = "red";
        System.out.println(light.color);

        // invalid case:
        trafficLight light2 = new trafficLight("blue");
        //light2.color = "blue"
        System.out.println(light2.color);


    }

}

