package Java_3rdPractise_Set;

import Pattern.A;

public class Appliance {
    void turnOn(){
        System.out.println( "The appliance is now on.");
    }
}
class Fan extends Appliance{
    void turnOn(){
        System.out.println("The fan is now spinning.");
    }
}
class Light extends Appliance{
    void turnOn(){
        System.out.println("The light is now glowing.");
    }
}
class AirConditioner extends Appliance{
    void turnOn(){
        System.out.println("The air conditioner is now cooling.");
    }
}
class ApplianceMain{
    public static void main(String[] args) {
//        Appliance appliance= new Appliance();
//        appliance.turnOn();
//        Fan fan = new Fan();
//        fan.turnOn();
//        Light light =new Light();
//        light.turnOn();
//        AirConditioner airConditioner = new AirConditioner();
//        airConditioner.turnOn();
        Appliance[] appliances= new Appliance[3];
        appliances[0]=new Fan();
        appliances[1]=new Light();
        appliances[2]=new AirConditioner();
        for (Appliance ai:appliances){
            ai.turnOn();
        }


    }


}
