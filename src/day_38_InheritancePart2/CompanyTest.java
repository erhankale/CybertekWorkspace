package day_38_InheritancePart2;

public class CompanyTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        FullTimeEmployee femp = new FullTimeEmployee();
        Contractor cont = new Contractor();

        emp.calculatePay(40, 40);
        femp.calculatePay(40,40);
        cont.calculatePay(40, 40);


    }
}
