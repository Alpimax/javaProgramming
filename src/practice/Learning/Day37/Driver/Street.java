package practice.Learning.Day37.Driver;

public class Street {

    public static void main(String[] args) {
        Car bmw = new Car("X5", "James", 31283284, 'C');
        System.out.println(bmw.driver);
        System.out.println(bmw.model);
        System.out.println(bmw.driver.name);
        System.out.println(bmw.driver.licenceNumber);
        System.out.println(bmw.driver.licenseType);


    }
}
