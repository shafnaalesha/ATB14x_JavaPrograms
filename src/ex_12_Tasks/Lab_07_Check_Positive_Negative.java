package ex_12_Tasks;
import java.util.Scanner;
public class Lab_07_Check_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if (n>0){
            System.out.println("Number is positive");
        } else if (n<0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}
