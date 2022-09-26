package practice.Learning.Day37.DebitCard;

public class DebitCard {
    //   card number (long), holder name (String), card type (String), pin (int), and balance (double)
    long cardNumber;
    String holderName, cardType;
    int pin;
    double balance;
    Debit debit;


    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        if (String.valueOf(cardNumber).length() == 16) {
            this.cardNumber = cardNumber;
        } else
            System.out.println("Invalid card number");

        this.holderName = holderName;

        this.cardType = cardType;

        if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else
            System.out.println("Invalid pin length");

        this.balance = balance;


    }


    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }


}
