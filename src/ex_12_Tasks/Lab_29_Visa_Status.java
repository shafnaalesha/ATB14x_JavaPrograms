package ex_12_Tasks;
import java.util.Scanner;
public class Lab_29_Visa_Status {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scanner.nextInt();
        System.out.println("Enter visa status (valid/invalid): ");
        String visa = scanner.next();
        if(age>0 & age >=18 & visa.equalsIgnoreCase("valid")) {
            System.out.println("You can Travel");
        }
            else{
                System.out.println("You cannot Travel");
            }
        }
    }
