package practice.Learning.day16;

public class IndexOfExample {
    public static void main(String[] args) {
        String s = "lollipop";
        //          01234567


        System.out.println("index of l: "+ s.indexOf("l"));
        System.out.println("index of last l: "+ s.lastIndexOf('l'));

        System.out.println("index of l: "+ s.indexOf("i"));
        System.out.println("index of l: "+ s.lastIndexOf("i"));

        System.out.println("index of p: "+s.indexOf("p"));
        System.out.println("last index of p: "+s.lastIndexOf("p"));

        String str = "definition";

        System.out.println("First i: "+str.indexOf("i"));
        System.out.println("Second i: "+str.indexOf("i",4));
        System.out.println("Third i: "+str.indexOf("i",6));

        System.out.println("-------------------------------------------");
        String msi = "mississippi";
                //    012345678910
        System.out.println("First s: "+msi.indexOf("s"));
        System.out.println("Second s: "+msi.indexOf("s",3));
        System.out.println("Third s: "+msi.indexOf("s",5));

    }
}
