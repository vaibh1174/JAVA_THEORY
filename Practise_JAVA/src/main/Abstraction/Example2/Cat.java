package main.Abstraction.Example2;

public class Cat extends Pet{
    public Cat(){
        super("Tom");
    }
    public void sayMeow(){
        System.out.println("MEoooowwwwwW!!! My name is "+ this.name);
    }
}
