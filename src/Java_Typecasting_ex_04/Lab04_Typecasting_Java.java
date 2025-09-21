package Java_Typecasting_ex_04;

public class Lab04_Typecasting_Java {
    public static void main(String[] args) {
        long phone_no= 9876543210l;
      //  short s = phone_no; // Narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s);

    }
}
