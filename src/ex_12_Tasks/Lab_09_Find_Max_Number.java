package ex_12_Tasks;

import java.util.Scanner;
public class Lab_09_Find_Max_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;
        if(a>b){
            max = a;
        }
        else {
            max = b;
        }
        System.out.println("Max number is " +max );
    }
}
