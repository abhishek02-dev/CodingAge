package Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		System.out.println();
		int arr[] = new int[n];
		int left=0;
		int right=arr.length-1;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		while(left<right) {
			temp= arr[left];
			arr[left]= arr[right];
			arr[right]= temp;
			left++;
			right--;
		}
//				for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		for(int i: arr) {
			System.out.print(i);
		}
	}
}
