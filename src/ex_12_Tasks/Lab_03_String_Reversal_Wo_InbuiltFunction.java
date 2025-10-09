package ex_12_Tasks;

import java.util.Scanner;

public class Lab_03_String_Reversal_Wo_InbuiltFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String for reversal");
        String string = scanner.nextLine();
        String reverse="";
        for (int i =string.length()-1;i >=0;i--) {
            reverse= reverse + string.charAt(i);
        }
        System.out.println("Reverse:" +reverse);
    }
}
