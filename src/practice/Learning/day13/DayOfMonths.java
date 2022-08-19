package practice.Learning.day13;

public class DayOfMonths {
    public static void main(String[] args) {
        String month = "February";

        switch (month){
            case "February":
                System.out.println("28 days");
                break;
            case "April":
            case "june":
            case "September":
            case "November":
                System.out.println("28 days");
                break;
            case "January":
            case "March":
            case "May":
            case "july":
            case "august":
                System.out.println("28 days");
                break;

        }
    }
}
