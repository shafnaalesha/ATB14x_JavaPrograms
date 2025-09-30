package ex_05_Java_Ternary_Operator;

public class Lab_04_Interview_Max_Two_TO {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        int x = 30;
        int y = 20;
        //System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println( max );


    }
}
