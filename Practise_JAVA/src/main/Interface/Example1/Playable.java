package main.Interface.Example1;

public abstract interface Playable {
    public static final int x =10;
    public abstract void play();
    default void m(){
        System.out.println(":)))))");
        w();
    }
    private static void w(){
        System.out.println(":|");
    }
}
