package day43_Polymorphism;

public class AnimalTest {

    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Bird();

        Animal animal = new Animal();
        animal = new Dog();
        animal = new Bird();

        //Bird b = new Dog(); //There is no relationship Dog and Bird
    }
}

class Animal{}

class Bird extends Animal{}

class Dog extends Animal{}