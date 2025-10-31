package ex_23_OOPS_Super_Abstraction;

public class Lab_02_Private {
}
class XYZ {
    XYZ() {
    }

    protected int my_gold = 10;
}
class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
}