package practice.Learning.Day29;

public class picture {
    public static void draw() {
        System.out.println("Drawing circle");
    }

    public static void draw(String color) {
        System.out.println("Drawing with" + color);
    }

    public static void draw(int size) {
        System.out.println("making picture of" + size);
    }

    public static void draw(String s, String s2) {
        System.out.println("drawing with two String.");
    }

    public static void draw(String s, int a) {
        System.out.println("drawing with one String, one integer.");
    }

    public static void main(String[] args) {
        draw();
        draw("red");
        draw("red ", 19);


    }


}
