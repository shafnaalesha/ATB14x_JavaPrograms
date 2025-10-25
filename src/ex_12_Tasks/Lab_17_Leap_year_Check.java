package ex_12_Tasks;
import java.util.Scanner;
public class Lab_17_Leap_year_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year = scanner.nextInt();
        if((year % 400 == 0)||(year % 4 == 0 && year % 100!=0)){
            System.out.println(year+ " is Leap year");
        }
        else {
            System.out.println(year+ " is not a Leap year");
        }
    }
}
