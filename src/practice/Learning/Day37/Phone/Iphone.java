package practice.Learning.Day37.Phone;

public class Iphone {
    // instance variable
    String model ;
    String color;
    double price ;
    int storage;


    // static variables

    static String os ;
    static String brand ;



    // constructor used to initialize instance variables


    public Iphone(String model, String color, double price, int storage) {
        System.out.println("CONSTRUCTOR BLOCK RUN ");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }

    //     static block used to initialized static variables
    static{
        System.out.println("STATIC BLOCK RUN ");
        os = "IOS";
        brand = "Aplle";

    }




    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
