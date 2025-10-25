package ex_12_Tasks;
import java.util.Scanner;
public class Lab_21_ATM_Withdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        double bal = 10000;
        double amount = scanner.nextDouble();
        if (amount <= 0){
            System.out.println("Invalid amount");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
            
        } else if (amount > bal) {
            System.out.println("insufficient balance");
        }
        else {
            bal = bal - amount;
            System.out.println("Withdrawal Succefull ! Remaining balance is Rs " +bal);
        }
    }
}
