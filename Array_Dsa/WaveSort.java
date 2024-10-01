package Array_Dsa;

import java.util.Scanner;

public class WaveSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i += 2) {
 
            if (i > 0 && arr[i] < arr[i - 1]) {

                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }


            if (i < n - 1 && arr[i] < arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
// { 10, 5, 6, 3, 2, 20, 100, 80 }

        }
        for (int i = 0; i <n  ; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
