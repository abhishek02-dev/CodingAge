package Array;

import java.util.Scanner;

public class ProdOfArray {
	public static void main(String[]args) {
		int prod=1,n;
		Scanner sc = new Scanner (System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		prod=prod*arr[i];
		}
		System.out.println("Total porduct is "+prod);
}
}