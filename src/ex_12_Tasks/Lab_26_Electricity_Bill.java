package ex_12_Tasks;
import java.util.Scanner;
public class Lab_26_Electricity_Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter units consumed");
        int units = scanner.nextInt();
        double bill;
        if (units <=100)
        bill = units * 0.50;
        else if (units <= 200)
            bill = (100 * 0.50) + ((units-100) * 0.75);
        else if (units <= 300)
           bill = (100 * 0.50) + (100 * 0.75) + ((units-200)*1.20);
        else
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
        System.out.println("Total Electricity bill is Rs " +bill);
        }

    }


