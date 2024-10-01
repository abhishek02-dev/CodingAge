package Array_Dsa;

import java.util.Scanner;

public class RearrangePositiveNegative {
    public static void main(String[] args) {
        int n, max = -999999, min = 999999, temp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int left = 0, right = n - 1;
                while (left <= right) {

                    if (arr[left] < 0 && arr[right] > 0) {
                        temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;
                        left++;
                        right--;
                    }

                    else if (arr[left] > 0) {
                        left++;
                    }

                    else if (arr[right] < 0) {
                        right--;
                    }
                }
            }
//{ -1, 2, -3, 4, 5, 6, -7, 8, 9 }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}