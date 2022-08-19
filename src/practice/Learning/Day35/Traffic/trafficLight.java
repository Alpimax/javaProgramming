package practice.Learning.Day35.Traffic;

public class trafficLight {

        String color;

        public trafficLight(String inputColor){
            boolean isValid = inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("yellow") || inputColor.equalsIgnoreCase("green");

            if(isValid){
                color = inputColor;
            }

        }

    }
