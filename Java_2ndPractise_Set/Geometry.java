package Java_2ndPractise_Set;

public class Geometry {
    static double pi=3.14;
    public void area(int radius){
        System.out.println(pi*(radius*radius));
    }
    void area(int length,int width){
        System.out.println(length*width);
    }

    public static void main(String[] args) {
        Geometry geometry=new Geometry();
        geometry.area(3);
        geometry.area(3,4);
    }
}
