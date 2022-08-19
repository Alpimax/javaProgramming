package practice.Learning.day16;

public class Email {
    public static void main(String[] args) {
        //saim@cydeo.com
        //name--> saim
        //domain--> cydeo
        String email1 = "saim@cydeo.com";
        int indexOfAt = email1.indexOf('@');
        String name = email1.substring(0,1).toUpperCase()+email1.substring(1, indexOfAt);
        int indexOfDox = email1.indexOf(".");
        String domain = email1.substring(indexOfAt + 1, indexOfDox);
        System.out.println("Full name : " + email1);
        System.out.println("Name part : " + name);
        System.out.println("Domain part : " + domain);



        /// another way to salve this email.com and @ email to get name and surname


        String email = "sergey_brin@gmail.com";

        int indexOfName = email.indexOf('_');
        String emailName = email.substring(0,1).toUpperCase()+email.substring(1, indexOfName);
        int indexOfAt1 = email.indexOf('@');
        String indexOfLastName = email.substring(indexOfName+1,indexOfName+2).toUpperCase()+email.substring(indexOfName + 2, indexOfAt1);
        int indexOfDot = email.indexOf('.');
        String indexOfDomain = email.substring(indexOfAt1 +1,indexOfAt+2).toUpperCase()+email.substring(indexOfAt1 + 2, indexOfDot);


        System.out.println("First name: " + emailName);
        System.out.println("Last name: " + indexOfLastName);
        System.out.println("Domain: " + indexOfDomain);


    }
}
