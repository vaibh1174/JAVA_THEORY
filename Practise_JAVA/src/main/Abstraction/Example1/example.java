package main.Abstraction.Example1;

public class example {
    public static void main(String[] args) {
//        Shape s=new Shape();
        Shape s1=new Circle();
        Shape circle=new Circle();
        Shape rectangle=new Rectangle();
        System.out.println(s1.area());
        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}
