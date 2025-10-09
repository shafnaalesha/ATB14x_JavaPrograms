package ex_12_Tasks;

public class Lab_06_Second_max_number {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max = 0;
        int sec_max =0;
        for (int i = 0; i < numbers.length ; i++) {
         if (numbers[i] > max){
             sec_max = max;
             max = numbers[i];
         }
         else {
             if (numbers[i] > sec_max){
                 sec_max = numbers[i];
             }
         }
        }
        System.out.println("Second maximum number: "+sec_max);
    }
}
