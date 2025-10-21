package ex_16_Arrays;
import java.util.Scanner;
public class Lab_15_2D_Reverse_Left_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g n = 3");
        int n = sc.nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
