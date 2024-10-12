package TwoD_Array;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        int n,m,sum=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j]= sc.nextInt();

            }
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
