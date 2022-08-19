package practice.Learning.day28;

public class replit {



        public static String coverString(String main, String coverMe) {
            // your code here
            if(main.contains(coverMe)) {
                main = main.replace(coverMe, "[" + coverMe + "]");
                return main;
            }else
            return "["+ main + "]" ;

        }

    public static void main(String[] args){}
//    output:
//    java [me]thods
}
