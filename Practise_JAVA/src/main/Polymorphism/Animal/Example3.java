package main.Polymorphism.Animal;

public class Example3 {
    public static void main(String[] args) {
        Animals a1=new Cat();
        Animals a2=new Dog();

        Cat c1=new Cat();
        Animals a3=c1;
        Cat c3= (Cat) a3;
    }
}
