package day43_Polymorphism;

public class TestMethod {

    public static void main(String[] args) {

        ChildA chA = new ChildA(); //=> chA can access to m1, m2, m3 methods

        ChildB chB = new ChildB(); //=> chb can access to m1, m2, m4 methods

        Parent p1 = new ChildA(); //polymorphism p1 access to only m1

        Parent p2 = new ChildB(); //p2 have aceess to only m1;

        MyInterface int1 = new ChildA(); // int1 have access to only m2

        MyInterface int2 = new ChildB(); // int2 have access to only m2

        ChildB int3 = (ChildB) int2;   //=> down-casting

        int3.m1();
        int3.m2();
        int3.m4();

        ((ChildB) int2).m4();  //This is the another wat to casting

    }
}

class Parent{
    public void m1(){}
}

interface MyInterface{
    void m2();
}

class ChildA extends Parent implements MyInterface{
    @Override
    public void m2(){}
    public void m3(){}
}

class ChildB extends Parent implements MyInterface{
    @Override
    public void m2() {}
    public void m4() {}
}