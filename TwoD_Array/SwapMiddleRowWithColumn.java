package TwoD_Array;

import java.util.Scanner;

public class SwapMiddleRowWithColumn {
    public static void main(String[] args) {
        int n,num,temp;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        num=n/2;
        int arr[][]=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
             arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(j==num){
                    temp=arr[i][num];
                    arr[i][num]=arr[num][i];
                    arr[num][i]=temp;
                }
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
