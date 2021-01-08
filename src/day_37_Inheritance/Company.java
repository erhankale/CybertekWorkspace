package day_37_Inheritance;

public class Company {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.name="Jackson";
        employee.jobTitle="Teacher";
        employee.age=26;
        employee.gender='M';

        employee.work();
        employee.eat("Salad");

    }
}
