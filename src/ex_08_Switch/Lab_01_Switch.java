package ex_08_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_01_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the day 1 to 7");
        if (scanner .hasNextInt()){
            int day = scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only, you fool!");
            }
        }
    }
}
