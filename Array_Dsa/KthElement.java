package Array_Dsa;

import java.util.Scanner;

public class KthElement {
    public static void main(String[] args) {
        int n,k;
        k=2;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if(i==(k-1)){
                System.out.println("kth element is "+arr[i]);
            }
        }
    }
}
