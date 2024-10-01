package Array;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        int n,min=999999,max=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
           if(min>arr[i]){
               min=arr[i];
           }
               if (max<arr[i]){
                   max=arr[i];
               }

            }
        System.out.print("largest :"+max+" smallest :"+min);
        }
    }

