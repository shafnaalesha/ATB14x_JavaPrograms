package ex_23_OOPS_Super_Abstraction;

public class Lab_05_Interface_Variables {
    public static void main(String[] args) {

    }
}
interface Pramod{
    final int a =10;
    void display();
}
class Dutta implements Pramod{
int aa = 10;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);
    }
}
class Soumya implements TTA{
    @Override
    public void practice(){

    }
}
class pramod1 implements TTA{
    @Override
    public void practice(){

    }
}
interface TTA{
    void practice();
}
class Pramod_Mentor implements TTA_Mentor{
    @Override
    public void teach(){

    }
}
class Dipak implements TTA_Mentor{
    @Override
    public void teach(){

    }
}
interface TTA_Mentor{
    void teach();
}