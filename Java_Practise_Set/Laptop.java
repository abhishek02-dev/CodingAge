package Java_Practise_Set;
import java.util.Scanner;
public class Laptop {
    String brand;
    String model;
    int ramSize;
    int storageSize;

    void start(){
        System.out.println("Your laptop has started.");
    }
    void upgradeRam(int additionalRam){
        int currentRamSize=ramSize+additionalRam;
        System.out.println("Your laptop updated ram size is "+currentRamSize);
    }
    void printLaptopDetails(){
        System.out.println("Laptop details:");
        System.out.print("Brand :");
        System.out.println(brand);
        System.out.print("Model :");
        System.out.println(model);
        System.out.print("RAM size :");
        System.out.println(ramSize);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop lp = new Laptop();
        System.out.println("Enter Brand name:");
        lp.brand=sc.nextLine();
        System.out.println("Enter Model name:");
        lp.model=sc.nextLine();
        System.out.println("Enter RAM size :");
        lp.ramSize=sc.nextInt();
        System.out.println("Enter storage size:");
        lp.storageSize=sc.nextInt();
        System.out.println("Enter additional RAM size");
        int additionalRam=sc.nextInt();
        lp.start();
        lp.upgradeRam(additionalRam);
        lp.printLaptopDetails();
    }
}
