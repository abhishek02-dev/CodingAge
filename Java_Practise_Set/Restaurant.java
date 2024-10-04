package Java_Practise_Set;

public class Restaurant {
String name;
String location;
String cuisineType;
double averageCost;

    public Restaurant(String name,String location,String cuisineType,double averageCost) {
        this.name = name;
        this.location=location;
        this.cuisineType=cuisineType;
        this.averageCost=averageCost;
    }
void serveDish(String dishName){
    System.out.println("You have ordered "+dishName);
}
void updateCost(double newCost){
     this.averageCost=newCost;
    System.out.println("The new average cost per person is "+averageCost);
}
void printRestaurantDetails(){
    System.out.println("Restaurant name : "+name);
    System.out.println("Location : "+location);
    System.out.println("Cuisine Type : "+cuisineType);
    System.out.println("Average cost per person is : "+averageCost);
}
    public static void main(String[] args) {
        Restaurant r= new Restaurant("Italian","Patna","Pasta",320);
        r.printRestaurantDetails();
         r.serveDish("Pizza");
         r.updateCost(340);
         r.printRestaurantDetails();
    }
}
