package Array_Dsa;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int n,left,right,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        left=arr[0];
        right=arr.length-1;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
