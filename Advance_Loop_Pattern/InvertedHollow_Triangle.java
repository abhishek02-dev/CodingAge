package Advance_Loop_Pattern;

import java.util.Scanner;

public class InvertedHollow_Triangle {
    public static void main(String[] args) {
        int n,temp;
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        temp=n;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n ; j++) {
                if((i==1)||j==i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            for (int j = 2; j <=n ; j++) {
                if((i==1)||j==temp){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            temp--;
            System.out.println();
        }
    }
}
