package ex_12_Tasks;
import java.util.Scanner;
public class Lab_25_Loan_Eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age");
        int Age = scanner.nextInt();
        System.out.println("Enter Salary");
        double Salary = scanner.nextDouble();
        System.out.println("Enter Credit Score");
        int CreditScore = scanner.nextInt();

        if(Age <=0 || Age < 18 || Age > 80){
            System.out.println("Not eligible for loan, Age wise");
        } else if (Salary<=0 || Salary < 30000) {
            System.out.println("Ineligible due to salary less than 30000");
        } else if (CreditScore <= 0 || CreditScore < 650 || CreditScore >= 850) {
            System.out.println("Credit score must be between 650 and 850.");
        }
        else {
            System.out.println("Congratulations! You are Eligible for loan");
        }
    }
}
