package practice.Learning.day12;

public class Starbucks {
    public static void main(String[] args) {
        String size = "Tall";
        double price = 0;
        int calories = 0;

        switch (size) {
            case "Tall":
                price = 2.50;
                calories = 100;
                break;
            case "Grande":
                price = 2.50;
                calories = 100;
                break;
            case "venti":
                price = 2.50;
                calories = 100;
                break;
        }
        if (price != 0 && calories != 0) {
            System.out.println("Size: " + size + " is calories: " + calories + " and costs : $" + price);

        }
    }
}