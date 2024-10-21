package Java_2ndPractise_Set;

public class Animal {
    String name;

    void sound() {
        System.out.println("This animal makes a sound.");
    }
}
 class Dog extends Animal{

     void sound(){
         System.out.println("Dog Barks...");
     }
 }
 class Cat extends Animal{
     void sound(){
         System.out.println("Cat meow...");
     }

 }


