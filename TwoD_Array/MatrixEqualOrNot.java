package TwoD_Array;

import java.util.Scanner;

public class MatrixEqualOrNot {
    public static void main(String[] args) {
        int n, m,count=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int arr1[][] = new int[n][m];
        int arr2[][] = new int[n][m];
        int arr3[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if( arr2[i][j] == arr1[i][j]){
                   count++;
               }
            }
        }
        if(count==n*m){
            System.out.println("Both matrices are equal");
        }else{
            System.out.println("Both matrices are not equal");
        }

    }
}
