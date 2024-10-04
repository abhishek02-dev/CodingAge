package Java_Practise_Set;

public class Library {
String name;
String location;
int booksAvailable;
double membershipFee;

    public Library(double membershipFee, int booksAvailable, String location, String name) {
        this.membershipFee = membershipFee;
        this.booksAvailable = booksAvailable;
        this.location = location;
        this.name = name;
    }

    void borrowBook(){
     booksAvailable--;
        System.out.print("After borrow ");
        System.out.println(this.booksAvailable+" total books available right now.");
    }
    void returnBook(){
        booksAvailable++;
        System.out.print("After return ");
        System.out.println(this.booksAvailable+" total books available right now.");
    }
    void printLibraryDetails(){
        System.out.println("Book name :"+name);
        System.out.println("Location :"+location);
        System.out.println("Total books avialable :"+booksAvailable);
        System.out.println("Membership Fee :"+membershipFee);
    }
    public static void main(String[] args) {
Library li=new Library(250,1500,"kankarbagh","SOM");
li.printLibraryDetails();
li.borrowBook();
li.returnBook();
li.printLibraryDetails();
    }
}
