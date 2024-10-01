package Array_Dsa;

import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        int n,last;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Leader are :");
         last=arr[n-1];
        System.out.println(last);
        for (int i = n-2; i >0 ; i--) {
            if(arr[i]>last){
                last=arr[i];
                System.out.println(last);
            }
        }
    }
}
//{ 16, 17, 4, 3, 5, 2 }