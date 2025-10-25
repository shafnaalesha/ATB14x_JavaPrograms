package ex_20_OOPs_Polymorphism.method_overloading.method_overriding;

public class Lab_03_MethodOverriding {
    public static void main(String[] args) {
       /* Pramod p1 = new Pramod();
        p1.home();

        Father f1 = new Father();
        f1.home();*/

        Father f2 = new Pramod(); //Dynamic Dispatch //Runtime Polymorphism
        f2.home();

        //Pramod p1 = new Father();
        //When father is getting born, child reference cannot be given to
    }
}
class Father{
    void home(){
        System.out.println("2BHK");
    }
}
class Pramod extends Father{
    @Override
    void home(){
        System.out.println("3BHK");
    }
}