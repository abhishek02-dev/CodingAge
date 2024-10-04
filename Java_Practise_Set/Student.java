package Java_Practise_Set;

import java.util.Scanner;

public class Student {

 String name;
 int rollNumber;
 String grade;
 double marks;

    void study(int hours){
        System.out.println(name+" studies around"+hours+" hours.");
    }
    void takeExam(double score){
        marks=score;
        System.out.println(name+" total score is "+marks+".");
    }
    void printStudentDetails(){
        System.out.println("Students Details: ");
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        int hours;
        double score;
        Student s = new Student();
        System.out.println("Enter students name:");
        Scanner sc= new Scanner(System.in);
        s.name=sc.next();
        System.out.println("Enter students rollNo:");
        s.rollNumber=sc.nextInt();
        System.out.println("Enter students grade:");
        s.grade=sc.next();
        System.out.println("Enter students marks:");
        s.marks=sc.nextDouble();
        System.out.println("Enter study hours:");
        hours= sc.nextInt();
        System.out.println("Enter score:");
        score=sc.nextDouble();
        s.study(hours);
        s.takeExam(score);
        s.printStudentDetails();
    }
}
