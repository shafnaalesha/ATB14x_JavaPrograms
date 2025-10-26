package ex_12_Tasks;
import java.util.Scanner;
public class Lab_30_Num_divisible_5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        if(n % 5==0 && n % 11 == 0){
            System.out.println(n+ " is divisible by 5 and 11");
        }
        else {
            System.out.println(n+ " is not divisible by 5 and 11");
        }
    }
}
