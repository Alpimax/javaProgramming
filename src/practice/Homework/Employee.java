package practice.Homework;

public class Employee {
    public static void main(String[] args) {
        String firstName = "Alper";
        String lastName = "Ozkan";
        String companyName = "BostonDynamics";
        String jobTitle = "SDET";
        char suite = 'A';
        int employeeID = 104912;
        int numberOfPto = 23;
        double salary = 145_000.00;
        boolean isFullTime = true;
        String fullName = firstName + " " +lastName;
        String eMail = (firstName + employeeID + "@" + companyName + ".com");
        String benefits = "$" + salary + " salary a year, " + numberOfPto + " PTO days and WFG";
        System.out.println(fullName);
        System.out.println(eMail);

    }
}
//        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time
//
//    declare new variables and use concatenation from previous variables to set their values
//
//        - full name (first and last name)
//        - email (first name + employee id @ company name.com)
//        - benefits (salary, number of PTO and add "work from home")
//
//    create a summary of the information and print it. Be creative
//        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year, 20 PTO days and work from home.