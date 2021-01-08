package day_38_InheritancePart2;

public class Car extends  Vehicle{

    int maxSpeed = 180;

    public Car(int maxSpeed){
        super(119);
        this.maxSpeed = maxSpeed;

    }

    public void display(){
        System.out.println("Maximum speed : "+super.maxSpeed );
        System.out.println("Maximum speed : "+maxSpeed );
    }
}
