package practice.Homework;

import java.util.*;

public class Sample {

    public static int makeChocolate(int small, int big, int goal) {

        if(goal % 5 <= small && ((small + big*5 )>= goal)){
            return goal % 5;

        }
            return -1;
    }


    // Do not touch below

    public static void main(String[] args) {
        System.out.println("makeChocolate(4,1,9) = " + makeChocolate(4, 1, 7));
    }



    }

