package ex_16_Arrays;

public class Lab_02_Arrays {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6};
        // 2nd way to create the array
        int[] mark2 = new int[5];
        int mark3[] = new int[5]; //Fixed Size

        String[] names = new String[3];
        names[0] = "Pramod";
        names[1] = "Amit";
        names[2] = "Yasho";

        System.out.println(marks[2]);
        System.out.println(mark2[0]);
        System.out.println(mark3[0]);
    }
}
