package ex_15_String_Buffer_Builder_Functions;

public class Lab_03_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);

        String s1 = "Pramod";
        s1 = s1 + "Dutta";
        System.out.println(s1);
    }
}
