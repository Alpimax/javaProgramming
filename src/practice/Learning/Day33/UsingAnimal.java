package practice.Learning.Day33;

public class UsingAnimal {

    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.species = "Lions";
        animal1.numberOfLegs = 4;
        animal1.age =15;
        animal1.canFly = false;
        animal1.weight = 200;

        System.out.println("animal1.species = " + animal1.species);
        System.out.println(animal1.numberOfLegs);
        System.out.println("animal1.age = " + animal1.age);
        System.out.println("animal1.canFly = " + animal1.canFly);
        System.out.println("animal1.weight = " + animal1.weight);

    }
}
