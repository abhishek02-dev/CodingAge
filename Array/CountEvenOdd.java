package Array;

import java.util.Scanner;

public class CountEvenOdd {
public static void main(String []args) {
	int n,a=0,b=0;
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter size of array:");
	n=sc.nextInt();
	int []arr= new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		if(arr[i]%2==0) {
			a++;
		}else {
			b++;
		}
	}
	System.out.println(a+" even elements and "+b+" odd elements.");
	
}
}
