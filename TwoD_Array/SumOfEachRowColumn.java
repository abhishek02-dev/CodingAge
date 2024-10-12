package TwoD_Array;

import java.util.Scanner;

public class SumOfEachRowColumn {
    public static void main(String[] args) {
        int n,m,temp,temp1,row=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }


        System.out.println("\nSum of each column:");
        for (int j = 0; j <m; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }


    }
}
