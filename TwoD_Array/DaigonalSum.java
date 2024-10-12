package TwoD_Array;

import java.util.Scanner;

public class DaigonalSum {
    public static void main(String[] args) {
        int n,num,sum=0,sum1=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        num=n/2;
        int arr[][]=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <1 ; i++) {
            for (int j = 0; j <n ; j++) {
                sum=sum+arr[i][j];
                i++;
            }
        }

        for (int i = 0; i <1 ; i++) {
            for (int j = n-1; j >=0 ; j--) {
                sum1=sum1+arr[i][j];
                i++;
            }
        }
        System.out.println("Sum of diagonal 1 is: "+sum);
        System.out.println("Sum of diagonal 2 is: "+sum1);

    }
}
