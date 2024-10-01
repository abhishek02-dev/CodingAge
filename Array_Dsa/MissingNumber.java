package Array_Dsa;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        int n,temp;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
  temp=arr[0];
        for (int i = 0; i <n ; i++) {
           if(temp!=arr[i]){
               System.out.println(temp+" is missing.");
               break;
           }
           temp++;
        }
    }
}
