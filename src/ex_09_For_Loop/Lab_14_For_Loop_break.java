package ex_09_For_Loop;

public class Lab_14_For_Loop_break {
    public static void main(String[] args) {// 0 to 49, Times : 50
        for (int i = 0; i < 50 ; i++) {
           // System.out.println(i);
            if(i==5) {
                break;
            }
            System.out.println(i);
        }
    }
}
