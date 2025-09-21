package Java_Typecasting_ex_04;

public class Lab03_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;



//        byte b = val; // Narrowing - Implicit Casting - not valid
        byte b = (byte) val; // Narrowing - Explicit Casting - Valid
        System.out.println(b);

    }
}
