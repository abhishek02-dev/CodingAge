package Java_3rdPractise_Set;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    String isbn;

    void input(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Book title : ");
        title=scanner.nextLine();
        System.out.println("Enter Book author : ");
        author=scanner.nextLine();
        System.out.println("Enter Book isbn : ");
        isbn=scanner.nextLine();
    }
    void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);
    }
    void calculateFine(int days){
        int fine=days*5;
        System.out.println("Total Fine : "+fine);
    }

    public static void main(String[] args) {
        Book book=new Book();
        book.input();
        book.display();
        book.calculateFine(15);
    }
}
