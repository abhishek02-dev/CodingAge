package Array_Dsa;

import java.util.Scanner;

public class Seggregate0And1 {

        public static void main(String[] args) {
            int n, temp;
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

                        if (arr[left] == 1 && arr[right] == 0) {
                            temp = arr[left];
                            arr[left] = arr[right];
                            arr[right] = temp;
                            left++;
                            right--;
                        }

                        else if (arr[left] == 0) {
                            left++;
                        }

                        else if (arr[right] == 1) {
                            right--;
                        }
                    }
                }
//{ 0, 1, 0, 1, 1, 1 }
            }
            for (int i = 0; i <n ; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
