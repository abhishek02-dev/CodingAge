package Java_2ndPractise_Set;

public class MathOperations {
    public void multiply(int a,int b){
        System.out.println(a*b);
    }
    public void multiply(double a,double b){
        System.out.println(a*b);
    }
    public void multiply(int a,int b,int c){
        System.out.println(a*b*c);
    }

    public static void main(String[] args) {
        MathOperations mathOperations=new MathOperations();
        mathOperations.multiply(20,30);
        mathOperations.multiply(23.45,34.67);
        mathOperations.multiply(43,54,65);
    }

}
