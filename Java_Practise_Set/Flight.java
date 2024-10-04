package Java_Practise_Set;

public class Flight {
    String flightNumber;
    String destination;
    int duration;
    double price;

    public Flight(String flightNumber, String destination, int duration, double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.duration = duration;
        this.price = price;
    }
    void boardFlight(){
        System.out.println("Flight is boarding.");
    }
    void updateTicketPrice(double newPrice){
        this.price=newPrice;
        System.out.println("Price after updation is "+this.price);
    }
    void printFlightDetails(){
        System.out.println("Your flight no is "+flightNumber);
        System.out.println("Destination :"+destination);
        System.out.println("Duration :"+duration);
        System.out.println("Price :"+price);
    }

    public static void main(String[] args) {
        Flight f=new Flight("1099","Delhi",120,3300);
        f.printFlightDetails();
        f.updateTicketPrice(3450);
        f.boardFlight();
        f.printFlightDetails();

    }
}
