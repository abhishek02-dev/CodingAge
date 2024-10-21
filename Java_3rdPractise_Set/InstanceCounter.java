package Java_3rdPractise_Set;

public class InstanceCounter {
    static int count;
    InstanceCounter(){
        count++;
    }
    void display(){
        System.out.println("Instance count :"+count);
    }

    public static void main(String[] args) {
        InstanceCounter instanceCounter = new InstanceCounter();
        InstanceCounter instanceCounter1 = new InstanceCounter();
        instanceCounter1.display();
    }
}
