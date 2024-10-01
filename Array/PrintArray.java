package Array;

import java.util.Scanner;

public class PrintArray {
public static void main(String []args) {
	int []arr= new int [5];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<arr.length;j++) {
		System.out.println(arr[j]);
	}
	
}
}
