package ex_12_Tasks;
import java.util.Scanner;
public class Lab_15_Smallest_of_2_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = scanner.nextInt(),b = scanner.nextInt();
        if(a<b) {
            System.out.println(a + " is smallest number");
        }
            else {
                System.out.println(b+ " is smallest number" );
            }
        }
    }

