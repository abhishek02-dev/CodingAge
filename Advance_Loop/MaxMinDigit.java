package Advance_Loop;

import java.util.Scanner;

public class MaxMinDigit {
    public static void main(String[] args) {
        int n,max=-999999,min=999999,r;
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        while(n>0){
            r=n%10;
            if(max<r){
                max=r;
            }
            if(min>r){
                min=r;
            }
            n=n/10;
        }
        System.out.println("Max digit is "+max);
        System.out.println("Min digit is "+min);
    }
}
