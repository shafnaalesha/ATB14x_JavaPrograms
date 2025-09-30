package ex_05_Java_Ternary_Operator;

public class Lab_07_Real_Age_Classification {
    public static void main(String[] args) {
String user_input = args[0]; //68
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        int age = Integer.parseInt(user_input); // to covert string into integer we are using integer.parseint
        String result = (age < 18) ? "Minor" : (age<=60) ? "Adult" : "Sr.Citizen";
        System.out.println(result);
    }
}
