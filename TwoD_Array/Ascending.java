package TwoD_Array;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        int n,m,temp;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                for (int k = 0; k <n ; k++) {
                    for (int l = 0; l <m ; l++) {
                        if(arr[i][j]<arr[k][l]){
                            temp=arr[i][j];
                            arr[i][j]=arr[k][l];
                            arr[k][l]=temp;
                        }
                    }
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
