package practice.Learning.day6;

public class Store {
    public static void main(String[] args) {
        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("Go and pick up some coffee");
        System.out.println("Items in the cart:" + ++numberOfItems);
        price += 3.55;

        System.out.println("Go pick some milk");
        System.out.println("Add 1 gallon of milk :"+ ++numberOfItems);
        System.out.println("Add 1 gallon of milk :"+ ++numberOfItems);
        price += 5.99;
        System.out.println("Your total is $" + price);
    }
}
