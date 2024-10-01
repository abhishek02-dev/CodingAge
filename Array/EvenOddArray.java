package Array;

import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        int n, count = 0, count1 = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                count++;
            } else {
                count1++;
            }
        }
        int even[] = new int[count];
        int odd[] = new int[count1];
        for (int i = 0; i < even.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] % 2 == 0) {
                    even[i] = arr[j];
                    i++;
                }
            }

        }
        for (int i = 0; i < odd.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] % 2 != 0) {
                    odd[i] = arr[j];
                    i++;
                }
            }

        }

        System.out.println("Even elements array are :");
        for (int i = 0; i < even.length ; i++) {

            System.out.print(even[i]+" ");

        }
        System.out.println();
        System.out.println("Odd elements array are :");
        for (int i = 0; i < odd.length ; i++) {

            System.out.print(odd[i]+" ");

        }
    }
}


