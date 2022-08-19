package practice.Learning.Day34;

public class HouseMarket {
    public static void main(String[] args) {


        House houseOne = new House();
        System.out.println(houseOne);

        houseOne.type = "Townhouse";
        houseOne.squareFeet =1300;
        houseOne.numberOfBathrooms = 3;
        houseOne.numberOfBedrooms = 2;
        houseOne.inCity = false;
        houseOne.hasGarage= true;

        System.out.println(houseOne);

        System.out.println("houseOne.calculateMortgage() = " + houseOne.calculateMortgage());
    }
}
