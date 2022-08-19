package practice.Learning.day13;

public class Elavator {
    public static void main(String[] args) {

        int floor= 4;
        String companies;

        switch (floor){
            case 1 :
                companies = "Lobby,Starbuck, Amazon Pick Up";
                break;
            case 2 :
                companies = "Nasa, Cydeo, Discover";
                break;
            case 3 :
                companies = "Uber, Lift, Chase";
                break;
            case 4 :
                companies = "Rooftop, Lounge";
                break;
            default:
                companies = "Invalid Floor Selected.";
        }
        System.out.println("Floor "+floor+" :"+companies);
    }
}
