package Array_Dsa;

import java.util.Scanner;

public class Mountain {
    public static void main(String[] args) {
        int n,last;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
//        last=arr[n-1];
        for (int i = 1; i <n-1 ; i++) {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                System.out.println("Mountain is "+arr[i]);
            }
        }
    }
}
//{ 16, 17, 11, 3, 5, 2, 8 }
