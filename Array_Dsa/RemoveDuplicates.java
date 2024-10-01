package Array_Dsa;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int temp[]= new int[n];
        int j=0;
        for (int i = 0; i <n-1 ; i++) {
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[n-1];
        int arr2[]=new int[j];
        for(int i = 0; i <j ; i++) {
            arr2[i]=temp[i];
        }
        for(int i:arr2){
            System.out.print(i+" ");
        }
    }
}
// 3,2,3,7,2,9,3,1,2,7
// output-  [ 3,2,7,9,1,7 ]
