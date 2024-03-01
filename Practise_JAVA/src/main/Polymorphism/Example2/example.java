package main.Polymorphism.Example2;

public class example {
    public static void main(String[] args) {
        A a1=new B();
        B b1=(B)a1;

        a1.x=20;
        b1.x="hey";

        b1.y=10;

        a1.m();
        a1.dance();
        b1.m();
    }
}
