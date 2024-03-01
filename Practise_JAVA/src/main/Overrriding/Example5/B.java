package main.Overrriding.Example5;

public class B extends A{
    public B(){
//        super();
        super(10);
        System.out.println("Executing B");
    }
    public B(int x){
        this();
        System.out.println("B");
    }
}
