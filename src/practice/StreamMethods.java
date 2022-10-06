package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(4, 6, 3, 36, 2,6));
        list1.stream();
        System.out.println(list1.stream().distinct().collect(Collectors.toList()));



    }
}
