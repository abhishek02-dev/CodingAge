package Array_Dsa;

import java.util.Scanner;

public class RotateByOne {

        public static void main(String[] args) {
            int n;
            Scanner sc =new Scanner(System.in);
            n=sc.nextInt();

            int arr[]=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            int last=arr[n-1];
            for (int i = n-1; i >0 ; i--) {
                arr[i]=arr[i-1];
            }

            arr[0]=last;
            for (int i = 0; i <n ; i++) {
                System.out.print(arr[i]+" ");
            }
        }


    }





