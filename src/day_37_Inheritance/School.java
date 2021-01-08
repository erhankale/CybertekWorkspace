package day_37_Inheritance;

public class School {

    public static void main(String[] args) {
        Person person =  new Person();
        Student student = new Student();



        person.name="Mike";
        person.age = 35;
        person.gender ='M';


        student.name= "Jenny";
        student.age= 30;
        student.gender= 'F';
        student.studentID= 10514039;

        person.eat("Steak");
        student.eat("Hamburger");

    }
}
