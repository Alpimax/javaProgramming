package practice.Learning.Day24;

import java.sql.SQLOutput;

public class SchoolStore {
    public static void main(String[] args) {
        String[] items = {"Backack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

        System.out.println("Full catalog\n\tID | Name\t | Price");
        for (int i = 0; i < items.length; i++) {
            System.out.println(itemId[i] + " | " + items[i] + " | $ " + prices[i]);
        }
        boolean inStock = false;
        for (String eachItem : items) {
            if (eachItem.equalsIgnoreCase("jacket")) {
                inStock = true;
                break;
            }
        }
        System.out.println("-----------------------------");
        System.out.println(inStock? "Jacket is in stock ": "We don't have jackets right now");


        double maxPrice = prices[0];
        int indexOfMax = 0;

        for(int i=0 ; i < prices.length;i++){
            if (prices[i]>maxPrice){
                maxPrice = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("-----------------------------");
        System.out.println(itemId[indexOfMax] + " | " + items[indexOfMax] + " | $ " + prices[indexOfMax]);

    }
}