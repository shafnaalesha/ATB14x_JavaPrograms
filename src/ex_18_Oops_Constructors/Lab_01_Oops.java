package ex_18_Oops_Constructors;

public class Lab_01_Oops {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;
        //        System.out.println(b2.name);

    }
}
class Baby{
    String name;//instance variable
    // Default Constructor also called
    Baby(){
        System.out.println("I am called, Object is created!");
    }
}