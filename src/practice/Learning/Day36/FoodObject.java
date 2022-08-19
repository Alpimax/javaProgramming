package practice.Learning.Day36;

import java.util.Arrays;

public class FoodObject {

    public static void main(String[] args) {



    Food order0 = new Food("Chicken",6,4.99,0);
    Food order1 = new Food("Broccoli",2,1.99,1);
    Food order2 = new Food("Steak",3,6.99,2);
    Food order3 = new Food("Apple",1,2.99,3);
    Food order4 = new Food("Beer",6,1.99,4);
    Food order5 = new Food("Chile Powder",1,0.99,5);
    Food order6 = new Food("Gouda Cheese",5,6.99,6);
    Food order7 = new Food("Olive Oil",5,12.99,7);
    Food order8 = new Food("Pasta",3,0.79,8);
    Food order9 = new Food("Rice",1,9.99,9);

    Food [] foodName = new Food[10];

        foodName[0] = order0;
        foodName[1] = order1;
        foodName[2] = order2;
        foodName[3] = order3;
        foodName[4] = order4;
        foodName[5] = order5;
        foodName[6] = order6;
        foodName[7] = order7;
        foodName[8] = order8;
        foodName[9] = order9;





        System.out.println(Arrays.toString(foodName));

}
}