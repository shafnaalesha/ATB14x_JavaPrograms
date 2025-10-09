package ex_12_Tasks;

import java.util.Scanner;

public class Lab_05_First_letter_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String sentence=scanner.nextLine();
        String[] word=sentence.split(" ");
        for (int i=0;i<word.length ;i++) {
            System.out.print(word[i].charAt(0)+" ");
        }
    }
}
