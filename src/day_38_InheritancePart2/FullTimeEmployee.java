package day_38_InheritancePart2;

public class FullTimeEmployee extends Employee{

    @Override    //with same name and same parameters
    public void calculatePay(int hours, double rate){
        System.out.println("Employee total pay : "+(hours*rate*1.1) );
    }


}
