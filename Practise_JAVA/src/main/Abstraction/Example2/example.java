package main.Abstraction.Example2;

public class example {
    public static void main(String[] args) {
        Pet p1=new Cat();
        Cat p2=new Cat();
        System.out.println(p1.name);
        p2.sayMeow();
        System.out.println(p2.name);
    }
}
