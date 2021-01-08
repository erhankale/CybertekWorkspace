package day_38_InheritancePart2;

public class Contractor extends Employee{

    @Override
    public void calculatePay(int hours, double rate) {
        System.out.println("Employee total pay : "+(hours*rate*1.12) );



    }
}
