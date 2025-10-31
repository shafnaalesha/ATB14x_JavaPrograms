package ex_23_OOPS_Super_Abstraction;

public class Lab_03_Multiple_Inheritance {
}
class Child1 implements Father1,Father2{
@Override
    public void money(){
    System.out.println("Child money");
}
}
interface Father1{
    final int a =10;
    void money();
}
interface Father2{
    void money();
}