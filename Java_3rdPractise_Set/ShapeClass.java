package Java_3rdPractise_Set;

public abstract class ShapeClass {

    abstract void doubleCalculateArea();
    abstract void doubleCalculatePerimeter();
}
class Circle extends ShapeClass{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    void doubleCalculateArea(){
        System.out.println("Area od circle :"+radius*3.14);
    }
    void doubleCalculatePerimeter(){
        System.out.println("Perimeter od circle :"+2*3.14*(radius*radius));
    }
}
class RectangleClass extends ShapeClass{
    double length;
    double width;
    RectangleClass(double length, double width){
        this.length=length;
        this.width=width;
    }
    void doubleCalculateArea(){
        System.out.println("Area od Rectangle :"+2*(length+width));
    }
    void doubleCalculatePerimeter(){
        System.out.println("Perimeter od Rectangle :"+length*width);
    }
}
class Calci{
    public static void main(String[] args) {
        Circle circle= new Circle(6);
        circle.doubleCalculatePerimeter();
        circle.doubleCalculateArea();
        RectangleClass rectangle = new RectangleClass(8,12);
        rectangle.doubleCalculatePerimeter();
        rectangle.doubleCalculateArea();
    }
}