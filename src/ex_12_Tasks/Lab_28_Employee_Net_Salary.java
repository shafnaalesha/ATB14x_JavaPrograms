package ex_12_Tasks;
import java.util.Scanner;
public class Lab_28_Employee_Net_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic salary");
        double basic = scanner.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double gross = basic + hra + da;
        double tax;
        if(gross <= 1200000)
            tax = 0;
        else
            tax = 0.10 * gross;
        double net = gross - tax;
        System.out.println("Net salary is Rs " +net);
    }
}
