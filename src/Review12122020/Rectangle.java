package Review12122020;

public class Rectangle extends Shape{

    public String name;
    public double width, length;

    public double calculateArea(){
        return width*length;
    }

    public double calculatePerimeter(){
        return (width+length)*2;
    }
}
