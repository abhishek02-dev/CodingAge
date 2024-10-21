package Java_2ndPractise_Set;

//base class
public class Employee {
    String name;
    double salary;
Employee() {}
    //constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    //method
    void getDetails(){
        System.out.println(this.name+" "+this.salary);
    }
}
//subclass which extends base class
class Manager extends Employee{
    String department;
Manager(){}
    //constructor
    public Manager(String name, double salary, String department) {
        this.name=name;
        this.salary=salary;
        this.department = department;
    }
//method to print details
    void getDetails(){
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println(this.department);
    }
    public static void main(String[] args) {
     Manager manager=new Manager("Abhi",56000,"developer");
     manager.getDetails();
    }
}
