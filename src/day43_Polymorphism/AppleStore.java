package day43_Polymorphism;

public class AppleStore {
    public static void main(String[] args) {

        AppleDevice mac = new Mac();
        mac.use();
//      mac.code(); This causes error because of no access.

        Mac mymac = new Mac();
        mymac.code();
        mymac.use();

        AppleDevice ipad = new Ipad();
        ipad.use();
//      ipad.draw():   this code causes error because of ParentClass does not give access to .draw() method
    }
}
