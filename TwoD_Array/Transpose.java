package TwoD_Array;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int n,m;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        int transpose[][]=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                transpose[i][j]=arr[j][i];
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
