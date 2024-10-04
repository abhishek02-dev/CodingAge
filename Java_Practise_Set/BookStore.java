package Java_Practise_Set;

public class BookStore {
 String name;
 String address;
 int bookInStock;
 double rating;

    public BookStore(String name,String address,int bookInStock,double rating) {
        this.name=name;
        this.address=address;
        this.bookInStock=bookInStock;
        this.rating=rating;
    }

    void sellBook(int numberSold){
        System.out.println("Out of "+bookInStock+" books "+numberSold+" books were sold.");
        this.bookInStock= bookInStock-numberSold;
 }
    void addBook(int numberAdd){
        this.bookInStock=bookInStock+numberAdd;
        System.out.println(numberAdd+" new books added in bookstock and now the total book in stocks are "+bookInStock);
    }
    void  printBookDetails(){
        System.out.println("Bookstore Name :"+name);
        System.out.println("Address :"+address);
        System.out.println("Total number of books in stock are: "+bookInStock);
        System.out.println("Rating :"+rating);
    }
    public static void main(String[] args) {
        BookStore book=new BookStore("Gyan Ganga","Patna",1500,8.8);
        book.printBookDetails();
        book.sellBook(400);
        book.addBook(650);
        book.printBookDetails();
    }
}
