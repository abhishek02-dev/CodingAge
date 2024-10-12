package TwoD_Array;

import java.util.Scanner;

public class IndexOfElement {
    public static void main(String[] args) {
        int n,m,num;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        num= sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j]= sc.nextInt();

            }
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {
                if(arr[i][j]==num){
                    System.out.println("index number =["+i+","+j+"]");
                    break;
                }
            }
        }
    }
}
