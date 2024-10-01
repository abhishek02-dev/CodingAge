package Array;

import java.util.Scanner;

public class DeleteElement {
            public static void main(String[] args) {
                int n,key, temp;
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                System.out.println("Print element value:");
                key=sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                for (int i = 0; i < arr.length ; i++) {
                    for (int j = arr.length-1; j <arr.length ; j++) {
                        if(arr[i]==key ) {
                            temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    }

                }
                for (int i = 0; i < arr.length-1 ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
}



