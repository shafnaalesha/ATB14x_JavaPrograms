package ex_12_Tasks;

import java.util.Scanner;

public class Lab_13_Inverted_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for pattern");
        int n = sc.nextInt();
        for (int i = n; i>0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
