package Array;

import java.util.Scanner;

public class InputOutput {
    public void input(int arr[],int s){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println();
    }
    public void output(int arr[],int s){
        for (int i = 0; i < s ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size1,size2;
        size1=sc.nextInt();
        size2=sc.nextInt();
        int arr1[]=new int[size1];
        int arr2[]=new int[size2];;
        InputOutput io =new InputOutput();
        io.input(arr1,size1);
        io.output(arr1,size1);
        io.input(arr2,size2);
        io.output(arr2,size2);

    }
}
