package Java_2ndPractise_Set;

public class Student {
    String name;
    int rollNo;
    String grade;

    public Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1=new Student("Abhishek", 03,"A");
        Student student2=new Student("Aman",07,"B");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
