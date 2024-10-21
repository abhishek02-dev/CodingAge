package Java_3rdPractise_Set;

import Practise.Vehicle;

public class FinalVehicle {
    final void run(){
        System.out.println("The vehicle is running.");
    }
}
class Car extends FinalVehicle{
    //Cannot override run method because run method is final and we cannot make any change in it so final method cannot be override.
//    void run(){
//        System.out.println("The car is running.");
//    }
}
class TestVehicle{
    public static void main(String[] args) {
        FinalVehicle vehicle = new FinalVehicle();
        vehicle.run();
    }
}
