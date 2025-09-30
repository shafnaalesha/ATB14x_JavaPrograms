package ex_04_Java_Typecasting;

public class Lab04_Typecasting_Java {
    public static void main(String[] args) {
        long phone_no= 9876543210l;
      //  short s = phone_no; // Narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s);

    }
}
