package Array;

import java.util.Scanner;

public class AverageOfArray {
	public static void main(String[] args) {
		int sum = 0, n, avg;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Average is " + avg);

	}
}