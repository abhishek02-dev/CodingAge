package TwoD_Array;

import java.util.Scanner;

public class RepeatingElements {
    public static void main(String[] args) {
        int n, m, count = 0, p;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

//        – 1     5      2
//        3    15    4
//        6     7     15
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                p = j + 1;
                count = 1;
                for (int k = i; k < n; k++) {
                    for (int l = p; l < m; l++) {
                        if (arr[i][j] == arr[k][l] ) {
                            count++;
                           // arr[k][l] = -1;
                        }
                    }
                    p = 0;
                }
                if(count>1){
                    System.out.println(arr[i][j]+" is repeated "+count+" times");
                }
            }
            }
        }
    }
