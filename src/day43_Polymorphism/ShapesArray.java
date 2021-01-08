package day43_Polymorphism;

import java.util.ArrayList;

public class ShapesArray {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Square();

        for (Shape each: shapes) {
            System.out.println(each.getClass().getSimpleName());
            each.draw();
        }

        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Triangle());
        shapeList.add(new Circle());
        shapeList.add(new Square());



    }
}
