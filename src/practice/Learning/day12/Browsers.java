package practice.Learning.day12;

public class Browsers {
    public static void main(String[] args) {
        String browser = "safari";

        switch (browser){
            case "chrome":
                System.out.println("Opening google in chrome");
                break;
            case "firefox":
                System.out.println("Opening google in firefox");
            case "safari":
                System.out.println("Special set up or apple computers");
                System.out.println("Opening in safari");
                break;
            default:
                System.out.println("Opening in chrome by default");

        }
    }
}
