package Array_Dsa;

import java.util.Scanner;

public class RotateByDElements {
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp[]=new int[k];
        for (int i = 0; i < k; i++) {
         temp[i]=arr[n-k+i];
        }
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int j = 0; j <k ; j++) {
            arr[j]=temp[j];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
