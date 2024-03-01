package main.Overrriding.Example6;

public class B extends A{
    String x;
    String y;
    public B(){
        this.x="hello";
        this.y="hie";
        super.x=20;
        System.out.println("B");
    }
}
