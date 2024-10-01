package Array_Dsa;

import java.util.Scanner;

public class MaxSubArray {

    public static void main(String[] main) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0, end = 0, temp_start = 0,max_sum=-99999,current_sum=0;

        for (int i = 0; i < n; i++) {
            current_sum += arr[i];

            if (max_sum < current_sum) {
                max_sum = current_sum;
                start = temp_start;
                end = i;
            }

            if (current_sum < 0) {
                current_sum = 0;
                temp_start = i + 1;
            }
        }
//        { -2, -3, 4, -1, -2, 1, 5, -3 }

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(max_sum);
    }
}


