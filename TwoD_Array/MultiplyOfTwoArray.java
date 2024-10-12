package TwoD_Array;

import java.util.Scanner;

public class MultiplyOfTwoArray {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        int arr1[][]=new int[n][m];
        int arr2[][]=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        int arr3[][]=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr3[i][j]=0;
                for (int k = 0; k <m ; k++) {
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
