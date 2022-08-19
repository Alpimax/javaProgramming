package practice.Homework;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 145_000 ;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double federalTax = salary * federalTaxRate;
        double stateTax = salary * stateTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - federalTax - stateTax;

        System.out.println("My salary is $" + salary +", I will pay state tax which is $" + stateTax +"\nAlso, I will pay federal tax must be $"+ federalTax + ", they are going to total $" + totalTax + ". I think,I will made $" + salaryAfterTax + " this year. Not bad not bad..."   );


    }
}
