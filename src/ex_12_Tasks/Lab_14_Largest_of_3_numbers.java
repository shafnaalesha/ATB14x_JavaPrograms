package ex_12_Tasks;
import java.util.Scanner;
public class Lab_14_Largest_of_3_numbers {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if(a>b && a>c){
            System.out.println(a+ "is largest");
        } else if (b>a && b>c) {
            System.out.println(b+ "is largest");

        }
        else{
            System.out.println(c+ "is largest");
        }
    }
}
