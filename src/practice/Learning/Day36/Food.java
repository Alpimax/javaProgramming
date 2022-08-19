package practice.Learning.Day36;

public class Food {

    String name;
    int quantity,id;
    double unitPrice, totalPrice;


    public Food(String name) {
        this.name = name;

    }


    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;

    }

    public Food(String name, int quantity, double unitPrice,int id) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        this.id = id;
    }

    public void calculatePrice(int unitPrice, int quantity) {

        totalPrice = unitPrice * quantity;
    }


    @Override
    public String toString() {
        return "Food        :" +
                "Name='" + name + '\'' +
                "\nGuantity=" + quantity +
                "\nUnitPrice=" + unitPrice +
                "\nTotalPrice=" + totalPrice
                ;
    }
}
