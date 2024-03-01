package main.Interface.Example1;

public class example {
    public static void main(String[] args) {
        Playable p1=new Piano();
        p1.play();
        Piano p2=(Piano)p1;
        p1.m();
        p2.m();
        System.out.println(p1.x);
        System.out.println(p2.x);
    }
}
