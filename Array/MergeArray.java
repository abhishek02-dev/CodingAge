package Array;

import java.util.Scanner;

public class MergeArray {
public static void main(String []args) {
//	int[] array1 = {1, 2, 3, 4};
//	int[] array2 = {5, 6, 7, 8};
//	int[] mergedArray = new int[array1.length + array2.length];
//
//	for (int i = 0; i < array1.length; i++) {
//		mergedArray[i] = array1[i];
//	}
//
//	for (int i = 0; i < array2.length; i++) {
//		mergedArray[array1.length + i] = array2[i];
//	}
//
//	for (int i : mergedArray) {
//		System.out.print(i + " ");
//	}
	int n,m;
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter size of 1st array:");
	n=sc.nextInt();

	int []arr= new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
			}
	System.out.println("Enter size of 2nd array:");
	m=sc.nextInt();
	int []arr2= new int[m];
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=sc.nextInt();
			}
	int []arr3= new int[m+n];


		for (int i = 0; i <n ; i++) {
			arr3[i]=arr[i];
		}

		for (int i = 0;  i<m ; i++) {
			arr3[n+i]=arr2[i];
		}

	for (int i:arr3){
		System.out.print(i+" ");
	}
}
}