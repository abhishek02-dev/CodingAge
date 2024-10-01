package Array_Dsa;

import java.util.Scanner;

public class KthMinimum {

        public static void main(String[] args) {
            int k,n,temp;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Kth number: ");
            k= sc.nextInt();
            System.out.println("Enter array size: ");
            n= sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    if(arr[j]<arr[i]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                    }

                }
            }

            System.out.print(arr[n-k]+" ");

        }
    }

