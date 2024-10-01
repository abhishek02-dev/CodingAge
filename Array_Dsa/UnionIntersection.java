package Array_Dsa;

import java.util.Scanner;

public class UnionIntersection {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        m = sc.nextInt();
        int arr1[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(" intersections:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("union:");
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr[i] < arr1[j]) {
                System.out.print(arr[i] + " ");
                i++;
            }else if(arr1[j] < arr[i]) {
                System.out.print(arr1[j]+" ");
                j++;
            } else{
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
        }
        System.out.println();


    }
}
// Array1 = { 1, 2, 4, 5, 6 }, Array2 = { 2, 3, 5, 7 }1
