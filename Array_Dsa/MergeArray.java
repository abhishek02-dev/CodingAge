package Array_Dsa;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
                int n,m;
                Scanner sc= new Scanner (System.in);
                System.out.println("Enter size of 1st array:");
                n=sc.nextInt();
                int []arr1= new int[n];
                for(int i=0;i<arr1.length;i++) {
                    arr1[i]=sc.nextInt();
                }
                System.out.println("Enter size of 2nd array:");
                m=sc.nextInt();
                int []arr2= new int[m];
                for(int i=0;i<arr2.length;i++) {
                    arr2[i]=sc.nextInt();
                }
                int []arr3= new int[m+n];
                for(int i=0;i<arr3.length;i++) {
               if(i<n){
                       arr3[i]=arr1[i];
               }else{
                   arr3[i]=arr2[0];

               }
                }
                for(int i:arr3){
                    System.out.print(i+" ");
                }
    }
}
