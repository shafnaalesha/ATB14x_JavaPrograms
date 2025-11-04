package ex_25_Enum;

public class Lab_05_Enum_Env {
    public static void main(String[] args) {
        System.out.println(Env.PROD.getBaseURL());
        System.out.println(Env.DEV.getBaseURL());

    }
}
