package Array;

import java.util.Scanner;

public class OddEvenAverage {
    public static void main(String[] args) {
        int n,sum=0,avg,count=0,count1=0,sum1=0,avg1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0){
                count++;
                sum=sum+arr[i];
            }else{
                count1++;
                sum1=sum1+arr[i];
            }
        }
        avg=sum/count;
        avg1=sum1/count1;
        System.out.println("Average of odd elements is "+avg+" and average of even elements is "+avg1);
    }
}
