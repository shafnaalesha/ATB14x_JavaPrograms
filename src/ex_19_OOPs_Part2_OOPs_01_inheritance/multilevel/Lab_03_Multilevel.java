package ex_19_OOPs_Part2_OOPs_01_inheritance.multilevel;

public class Lab_03_Multilevel {
    public static void main(String[] args) {
        Son pramod = new Son();
        pramod.home();
        pramod.bhk3();
        pramod.gf();
        pramod.extra();

        Father f = new Father();
        f.gf();
        f.home();
        f.extra();

        GrandFather gf =  new GrandFather();
        gf.gf();
        gf.home();

        // Dynamic Dispatch
        GrandFather g1 = new Son();
        Father f1  = new Son();
        //Son s1 = new GrandFather();
        //Son s2 = new Father();
    }
}
