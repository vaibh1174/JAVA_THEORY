package main.Encapsulation;

public class Cat {
    private String name="martin";
    protected int age;
    private boolean dead;

    public String getName() {
        return name;
    }

     public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}

