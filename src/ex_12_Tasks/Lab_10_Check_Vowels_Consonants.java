package ex_12_Tasks;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Lab_10_Check_Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character between a-z:");
        String ch = sc.next();
        if (ch.equalsIgnoreCase("A") || ch.equalsIgnoreCase("E") || ch.equalsIgnoreCase("I") || ch.equalsIgnoreCase("O") || ch.equalsIgnoreCase("U")) {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonent");
        }
    }
        }



