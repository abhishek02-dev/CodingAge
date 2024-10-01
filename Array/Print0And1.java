package Array;

import java.util.Scanner;

public class Print0And1 {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];


        int i=0;
        while(i<n){
            int temp= sc.nextInt();
            if(temp==0 ||temp==1){
                arr[i]=temp;
                i++;
            }else {
                System.out.println(temp+" is invalid");
            }
        }



    }
}
