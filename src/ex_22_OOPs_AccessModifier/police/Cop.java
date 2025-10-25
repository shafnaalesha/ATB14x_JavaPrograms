package ex_22_OOPs_AccessModifier.police;

public class Cop {
    public int gun;
    private String iCard;

    public Cop(int bullet){
        this.gun = bullet;
    }
    //Method and Behav
    protected void canIShoot(){
        System.out.println("Yes u can");
    }
    void thisDefaultF1(){
        System.out.println("Hi Cop");
    }
}
