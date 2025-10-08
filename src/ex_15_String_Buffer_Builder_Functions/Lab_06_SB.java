package ex_15_String_Buffer_Builder_Functions;

public class Lab_06_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);
    }
}
