package Java_2ndPractise_Set;

import javax.xml.namespace.QName;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.println(this.name+" "+this.age);
    }
}
class Student1 extends Person{
    int roll;

    public Student1(String name, int age, int roll) {
        super(name, age);
        this.roll = roll;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println(this.roll);
    }

    public static void main(String[] args) {
        Student1 s1=new Student1("Aman",24,7);
        s1.displayInfo();
    }
}

