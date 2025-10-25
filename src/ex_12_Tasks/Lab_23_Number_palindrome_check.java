package ex_12_Tasks;
import java.util.Scanner;
public class Lab_23_Number_palindrome_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int original = num, reverse = 0;

        while(num > 0) {
            int digit = num %10;
            reverse = reverse*10 + digit;
            num /= 10;
        }
        if(original==reverse) {
            System.out.println(original + " is a palindrome");
        }
            else{
            System.out.println(original + " is not a palindrome");
        }
    }
}
