package practice.Homework;

public class BuyHouse {
    public static void main(String[] args) {
        int creditScore = 710;
        int salary = 145_000;

        boolean useLoan = (salary >= 100_000 && creditScore >= 720) || (salary >= 80_000 && creditScore >= 740);
        System.out.println("you can use loan for buy a house = " + useLoan);

    }
}
