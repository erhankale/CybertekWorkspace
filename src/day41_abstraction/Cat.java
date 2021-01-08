package day41_abstraction;

public abstract class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Cat is eating cat food");
    }

    @Override
    public void breathe() {
        System.out.println("Cat is breathing");

    }
}
