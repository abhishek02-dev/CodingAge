package Java_2ndPractise_Set;

public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Book book=new Book("Harry Potter" ,"harry", 230.00 );
        System.out.println(book.toString());
        Book book1=new Book("Harry " ,"Garry", 290.00 );
        System.out.println( book1.toString());
    }
}
