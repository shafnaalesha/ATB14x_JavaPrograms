package ex_22_OOPs_AccessModifier.police;

public class Rahul extends Cop {
    public Rahul(int bullet) {
super(bullet);
    }

    public static void main(String[] args) {
        Cop p = new Cop(100);
        p.thisDefaultF1();
    }
}
