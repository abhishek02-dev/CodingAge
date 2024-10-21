package Java_3rdPractise_Set;

public class BookClass {
    String title;
    String author;
    double price;

    public BookClass(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public BookClass(BookClass b) {
        title=b.title;
        author=b.author;
        price=b.price;
    }

    public BookClass() {

    }

    void display(){
        System.out.println("Book Title :"+title);
        System.out.println("Book Author :"+author);
        System.out.println("Book Price :"+price);
    }

//    public static void main(String[] args) {
//        BookClass bookClass = new BookClass("Great work of time","John Crowley",835);
//        bookClass.display();
//        BookClass bookClass1= new BookClass(bookClass);
//        bookClass1.display();
  //  }
}
class BookSecond extends BookClass{
    public BookSecond(BookClass b){
        super("Great","John",890);
        title=b.title;
        author=b.author;
        price=b.price;
    }
    void display(){
        System.out.println("Book Title :"+title);
        System.out.println("Book Author :"+author);
        System.out.println("Book Price :"+price);

    }

    public static void main(String[] args) {
        BookClass bookClass2=new BookSecond(new BookClass());
        bookClass2.display();
    }
}
