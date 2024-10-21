package Java_3rdPractise_Set;

public class Shape {
    double area(int radius){
        return 3.14*radius;
    }
    int area(int length,int width){
        return length*width;
    }
}
class Triangle extends Shape{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    double area(){
        return 0.5*base*height;
    }
    void displayArea(){
        System.out.println("Area of Triangle is "+area());
    }
}
class Test{
    public static void main(String[] args) {
        Triangle triangle=new Triangle(12,7);
        triangle.displayArea();
        Shape circle =new Shape();
        System.out.println("Area of circle is "+circle.area(4));
        Shape rectangle = new Shape();
        System.out.println("Area of rectangle is "+rectangle.area(8,12));
    }
}