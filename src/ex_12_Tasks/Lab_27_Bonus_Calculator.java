package ex_12_Tasks;
import java.util.Scanner;
public class Lab_27_Bonus_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary = scanner.nextDouble();
        System.out.println("Enter Years of Experience");
        int years = scanner.nextInt();
        double bonus;
        if (years < 1)
            bonus=0;
        else if (years <= 3 )
            bonus = salary*0.05;
        else if (years <= 6)
            bonus = salary*0.10;
        else
            bonus = salary*0.15;
        System.out.println(" Your bonus is Rs " +bonus);
        }

    }


