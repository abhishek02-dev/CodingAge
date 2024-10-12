package TwoD_Array;

import java.util.Scanner;

public class NumberPresentOrNot {
    public static void main(String[] args) {
        int n,m,num,count=0;
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
                    count++;
                    System.out.println("The given number "+num+" is present in the array.");
                    break;
                }
            }
        }
        if(count==0){
            System.out.println("The given number "+num+" is not present in the array.");
        }
    }
}
