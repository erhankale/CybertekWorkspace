package day_38_InheritancePart2;

public class StaticTest {
    public static void main(String[] args) {

        StaticSub obj = new StaticSub();

        obj.num=5;
        obj.print();

        StaticSuper.num=10;             //Static olmasi nedeniyle butun objelerin num ozelligini degistirdik!
        obj.print();
        System.out.println(StaticSub.num);

        // StaticSub.m2();                 //m2 static olmadigi icin classname ile cagiramayiz,
        obj.m2();                       //cunku m2 instance method

        StaticSub.m1();

    }
}
