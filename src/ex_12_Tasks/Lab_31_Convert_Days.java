package ex_12_Tasks;
import java.util.Scanner;
public class Lab_31_Convert_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Days");
        int totaldays = scanner.nextInt();
        int years = 0, months = 0, days = 0;
        if (totaldays >= 0) {
            years = totaldays / 365;
            totaldays = totaldays % 365;

            months = totaldays / 30;
            totaldays = totaldays % 30;

            days = totaldays;

            System.out.println(years + " Years, " + months + " Months and " + days + " Days. ");

        } else {
            System.out.println("Invalid Date");
        }
    }
}