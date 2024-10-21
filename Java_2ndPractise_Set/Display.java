package Java_2ndPractise_Set;

public class Display {
    void show(String firstName){
        System.out.println("String : "+firstName);
    }
    void show(String firstName , String lastName){
        System.out.println("String 1: "+firstName+" String 2: "+lastName);
    }
    void show(int id){
        System.out.println("Integer : "+id);
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.show("Abhshek");
        display.show("Abhishek","Kumar");
        display.show(569);
    }
}
