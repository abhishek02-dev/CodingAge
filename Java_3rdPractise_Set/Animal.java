package Java_3rdPractise_Set;


public class Animal {
    String habitat;
    Animal(String habitat){
        this.habitat=habitat;
    }
    void display(){
        System.out.println("Animal habitat :"+habitat);
    }
}
class Birds extends Animal{
    String featherColor;

    public Birds(String habitat,String featherColor) {
        super(habitat);
        this.featherColor = featherColor;
    }
    void display(){
        super.display();
        System.out.println("Birds Feather color :"+featherColor);
    }
}
class Fish extends Animal{
    String waterType;

    public Fish(String habitat,String waterType) {
        super(habitat);
        this.waterType = waterType;
    }
    void display(){
        super.display();
        System.out.println("Fish WaterType :"+waterType);
    }
}
class  Main {
    public static void main(String[] args) {
        Animal birds = new Birds("Forest", "White");
        Animal fish = new Fish("Aquatic", "Fresh");
        System.out.println("Birds Details :");
        birds.display();
        System.out.println("Fish Details :");
        fish.display();
    }
}