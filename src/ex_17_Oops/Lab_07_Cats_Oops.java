package ex_17_Oops;

public class Lab_07_Cats_Oops {
    public static void main(String[] args) {
        Cat c1;
        Cat c2;
        Cat c23 = new Cat();
        Cat c24 = new Cat("Lucy");
        Cat c25 = new Cat("Spicy");
        Cat c26 = new Cat("Mirchi");

        System.out.println(c24.name);
        System.out.println(c25.name);

        c25.running();
        c26.running();
    }
}
class Cat {
    String name; //instance variable
Cat() {
    name = "Kitty";
}
Cat(String nameParam) {
    this.name = nameParam;
}
void running() {
    int local_var = 10; //Local variable
    System.out.println("Who is running ->" + this.name);
}
}