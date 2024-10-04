package Java_Practise_Set;

public class Hotel {
String name;
String location;
int roomsAvailable;
double rating;

    public Hotel(String name, String location, int roomsAvailable, double rating) {
        this.name = name;
        this.location = location;
        this.roomsAvailable = roomsAvailable;
        this.rating = rating;
    }
    void bookRoom(){
    roomsAvailable--;
        System.out.println("After booking "+roomsAvailable+" rooms available");
    }
    void cancelRoom(){
        roomsAvailable++;
        System.out.println("After cancelling "+roomsAvailable+" rooms available");
    }

void printHotelDetails(){
    System.out.println("Hotel name :"+name);
    System.out.println("Location :"+location);
    System.out.println("Available rooms :"+roomsAvailable);
    System.out.println("Rating :"+rating);
}

    public static void main(String[] args) {
        Hotel h= new Hotel("Pacific","Patna",20,4.3);
        h.printHotelDetails();
        h.bookRoom();
        h.cancelRoom();
        h.printHotelDetails();

    }
}
