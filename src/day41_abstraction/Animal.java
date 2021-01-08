package day41_abstraction;

public abstract class Animal {

    public abstract void eat();                 //Abstract Method
    public abstract void breathe();
    public void move(){                         //Instance Method
        System.out.println("Moving");
    }
}
