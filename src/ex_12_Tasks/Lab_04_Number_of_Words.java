package ex_12_Tasks;
import java.util.Scanner;
import java.util.Arrays;
public class Lab_04_Number_of_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String for Word count");
String string = scanner.nextLine();
String[] splitted = string.split(" ");

        System.out.println("No of words in a string is: " +splitted.length);
    }
}
