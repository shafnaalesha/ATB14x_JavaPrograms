package ex_12_Tasks;
import java.util.Scanner;
public class Lab_22_Valid_Triangle_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 sides of a Triangle");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if(a + b > c && b + c > a && a + c > b){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("InValid Triangle");
        }
    }
}
