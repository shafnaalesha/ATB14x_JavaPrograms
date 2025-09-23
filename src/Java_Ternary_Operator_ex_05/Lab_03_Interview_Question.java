package Java_Ternary_Operator_ex_05;

public class Lab_03_Interview_Question {
    public static void main(String[] args) {
        int age = 21;

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

 String result = (age > 18) ? (age > 25 ? "You can drink" : "You can go to GOA, ButN can't Drink") : "No";
        System.out.println(result);

        String result1 = (age > 18) ? (age > 26 ? "You can drink" : "You can go Goa, but you can't Drink") : "No";
        System.out.println(result1);
    }
}
