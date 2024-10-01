package Array;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        int max=-999999,temp=-999999;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=max){
                if (temp<arr[i]){
                    temp=arr[i];
                }
            }

        }
        System.out.println(temp);
    }

}
