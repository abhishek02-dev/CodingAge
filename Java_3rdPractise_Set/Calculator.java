package Java_3rdPractise_Set;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4,6));
        System.out.println(calculator.add(5.67,7.68));
        System.out.println(calculator.add(56,76,887));
    }
}
