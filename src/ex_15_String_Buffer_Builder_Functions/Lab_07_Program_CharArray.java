package ex_15_String_Buffer_Builder_Functions;
import java.util.Scanner;
public class Lab_07_Program_CharArray {
    public static void main(String[] args) {
        // Write a program to reverse a string without using inbuilt functions.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input String, i will reverse it");
        String user_input = scanner.next();
        //pramod

        String reverse_user_input = "";

        char[] arr = user_input.toCharArray();

        for (int i = arr.length-1; i >=0 ; i--) {
            reverse_user_input = reverse_user_input + arr[i];
        }

        System.out.println(reverse_user_input);
        }

    }

