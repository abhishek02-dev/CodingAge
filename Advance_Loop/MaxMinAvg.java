package Advance_Loop;

import java.util.Scanner;

public class MaxMinAvg {
    public static void main(String[] args) {
        int sum=0,max=-9999999,min=9999999;
        float avg;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=10 ; i++) {
            int a =sc.nextInt();
            if(max<a){
                max=a;
            }
            if(min>a){
                min=a;
            }
            sum=sum+a;
        }
        avg=(float) sum/10;
        System.out.println("Max ="+max);
        System.out.println("Min ="+min);
    System.out.println("Average ="+avg);

    }
}
