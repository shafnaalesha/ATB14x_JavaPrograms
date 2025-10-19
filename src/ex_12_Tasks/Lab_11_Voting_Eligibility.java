package ex_12_Tasks;
import java.util.Scanner;
public class Lab_11_Voting_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else {
            System.out.println("Not eligible to Vote");
        }
    }
}
