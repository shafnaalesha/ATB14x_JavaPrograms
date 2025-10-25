package ex_12_Tasks;
import java.util.Scanner;
public class Lab_19_Char_is_Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = scanner.next().charAt(0);
        if((ch >= 'a' && ch <='z') ||(ch >= 'A' && ch <='Z') ){
            System.out.println(ch+ " is an Alphabet");
        }
        else {
            System.out.println(ch+ " is not an Alphabet");
        }
    }
}
