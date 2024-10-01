package Array_Dsa;

import java.util.Scanner;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int n,c=0;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
            if(arr[i]%2==0){
                c++;
            }
        }
        int even[]=new int[c];
        int odd[]=new int [n-c];
        for (int i = 0; i <n ; i++) {

        }
    }

}
