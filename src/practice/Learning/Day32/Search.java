package practice.Learning.Day32;

import practice.Learning.Day31.ArrayListt;
import practice.Learning.my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {

        ArrayList<String> days = EasyData.getDaysOfWeek();
        System.out.println(days);
    }


        public static int SearchInList (String target , ArrayList<String> list){
        int count = 0;
        for (String each : list){
            if(each.equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }
}
