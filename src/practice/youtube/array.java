package practice.youtube;

public class array {
    public static void main(String[] args) {

        String[] cars = new String[5];
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        cars[3] = "Bmw";
        cars[4] = "Mercedes";
        System.out.println();

        for( int i=0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
