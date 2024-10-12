package TwoD_Array;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int n, m,max=-999999,min=999999;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int arr1[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (min>arr1[i][j]){
                    min=arr1[i][j];
                }
                    if(max<arr1[i][j]) {
                        max = arr1[i][j];
                    }

            }
        }
        System.out.println("Maximum ="+max);
        System.out.println("Minimum ="+min);

    }
}
