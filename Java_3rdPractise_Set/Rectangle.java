package Java_3rdPractise_Set;

public class Rectangle implements Drawable ,Resizable{ int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void draw(){
    System.out.println("Draw a Rectangle of size "+length+" length and "+width+" width.");
}
public void size(int resizeLength,int resizeWidth){
        length=resizeLength;
        width=resizeWidth;
    System.out.println("Resized length and width of rectangle are "+length+" length and "+width+"width.");
}

public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(7,8);
    rectangle.draw();
    rectangle.size(12,10);
}
}