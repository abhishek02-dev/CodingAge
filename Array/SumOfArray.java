package Array;

import java.util.Scanner;

public class SumOfArray {
		public static void main(String[]args) {
			int sum=0,n;
			Scanner sc = new Scanner (System.in);
			n=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum=sum +arr[i];
			}

			System.out.println("sum is "+sum);
}
}
