package ex_09_For_Loop;

public class Lab_16_For_Loop_Continue_Even {
    public static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
if(i%2==0){
    continue;
}
           /* if(i%2!=0){
                continue;
            }*/ // even
            System.out.println(i);
        }
    }
}
