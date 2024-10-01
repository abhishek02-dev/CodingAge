package Advance_Loop_Pattern;

import java.util.Scanner;

public class Hollow_InvertedLeftHalfPyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n ; j++) {

                    if ((i == 1) || (j==i||j == n)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

            }

            System.out.println();
        }
    }
}
