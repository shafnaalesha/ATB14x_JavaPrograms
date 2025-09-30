package ex_04_Java_Typecasting;

public class Lab03_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;



//        byte b = val; // Narrowing - Implicit Casting - not valid
        byte b = (byte) val; // Narrowing - Explicit Casting - Valid
        System.out.println(b);

    }
}
