package Java_3rdPractise_Set;

public class ResourceInitializer {

    static {
        System.out.println("loading Configuration...");
    }
    void display(){
        System.out.println("Resource have been initialized.");
    }

    public static void main(String[] args) {
        ResourceInitializer resourceInitializer = new ResourceInitializer();
        resourceInitializer.display();
    }
}
