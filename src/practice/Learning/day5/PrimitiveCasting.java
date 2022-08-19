package practice.Learning.day5;

public class PrimitiveCasting {
    public static void main(String[] args) {
        // Convert from one primitive datatype to another
        //[smallest] byte -> short -> int -> long -> float -> double [largest]
        //widening convention go from smaller datatype to bigger datatype this happens automatically
        // ex: int = 10 ; --> long l = i ;
        byte b = 14;
        int i = b;
        System.out.println(i);
        float f = 10;
        System.out.println(f);

        double d = 32;
        byte b2 = (byte)d; // double is bigger than int, soI will need to cast to int
        System.out.println(b2);

        int i3 = 500;
        byte b3 = (byte)i3; // int is bigger than byte, so I will need to cast to byte
        System.out.println(b3);




    }
}
