package practice.Learning.Day40;

public class Parent {
    public static void hello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    //    @Override : Static variables cannot override
    public static void hello() { // when I make this method, I am hiding the one from parent
        System.out.println("Hello from Child");
    }
}

class Run {
    public static void main(String[] args) {
        Parent.hello();
        Child.hello();
    }
}