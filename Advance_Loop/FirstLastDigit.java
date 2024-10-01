package Advance_Loop;

import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        int n,temp,r,digit=0;
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        temp=n;
        while(temp>0){
            r=n%10;
            digit++;
            temp=temp/10;
        }
        temp=n;
        for (int i = 1; i <=digit ; i++) {
         r=temp%10;
            if(i==digit){
                System.out.println("First digit is "+r);
            }
         if(i==1){
             System.out.println("Last digit is "+r);
         }

         temp=temp/10;
        }
    }
}
