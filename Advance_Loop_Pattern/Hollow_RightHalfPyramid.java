package Advance_Loop_Pattern;

import java.util.Scanner;

public class Hollow_RightHalfPyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if((i==n)||(j==1||j==i)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
