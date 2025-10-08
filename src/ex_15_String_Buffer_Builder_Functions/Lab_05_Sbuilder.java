package ex_15_String_Buffer_Builder_Functions;

public class Lab_05_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World"); //HelloWorld
        sb.reverse(); // dlroW olleH
        System.out.println(sb);
    }
}
