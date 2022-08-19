package practice.Learning.Day35.Traffic;

public class carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputPersian){
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputPersian;
        calculatePrice();
    }

    public void calculatePrice(){
        totalPrice = width * length * unitPrice;

        if(isPersian){
            totalPrice += 200;
        }
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", " + (isPersian ? "Persian" : "Regular") + " carpet " +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

