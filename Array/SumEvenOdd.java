package Array;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        int n,sum1=0,sum2=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();

            if(arr[i]%2==0){
                sum1=sum1+arr[i];
            }else {
                sum2=sum2+arr[i];
            }
        }
        System.out.println("Sum of even number is "+sum1+" and sum of odd number is "+sum2);

    }
}
