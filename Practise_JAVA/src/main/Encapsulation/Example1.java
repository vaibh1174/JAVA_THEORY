package main.Encapsulation;

//import static main.Encapsulation.Cat.name;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat c1 = new Cat();
        c1.setName("john");
        c1.setAge(11);
        System.out.println(c1.getName());
        System.out.println(c1.getAge());
        System.out.println(!c1.isDead() ?"ALIVEE":"DEAD");
    }


}
