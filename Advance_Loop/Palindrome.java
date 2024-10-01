package Advance_Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int a,b,r,temp,rev=0;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        for (int i = a; i <=b ; i++) {
            temp=i;
            while(temp>0){
                r=temp%10;
                rev=rev*10+r;
                temp=temp/10;
            }
            if(rev==i){
                System.out.println(rev+" is a palindrome number.");
            }
            rev=0;

        }

    }
}
