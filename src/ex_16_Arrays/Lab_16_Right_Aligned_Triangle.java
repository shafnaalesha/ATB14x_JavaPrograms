package ex_16_Arrays;
import java.util.Scanner;
public class Lab_16_Right_Aligned_Triangle {
    public static void main(String[] args) {
        //int n = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g n = 3");
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
