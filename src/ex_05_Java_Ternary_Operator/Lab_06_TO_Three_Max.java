package ex_05_Java_Ternary_Operator;

public class Lab_06_TO_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 8;
        int n3 = -12;

        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.printf("max is %d",max);
    }
}
