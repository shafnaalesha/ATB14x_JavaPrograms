package ex_16_Arrays;
import java.util.Arrays;
public class Lab_09_IQ_2nd_High_Number_array {
    public static void main(String[] args) {
int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
