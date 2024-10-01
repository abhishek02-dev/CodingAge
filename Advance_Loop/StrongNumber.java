package Advance_Loop;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        int num,temp,sum=0,last,res=1;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while (temp>0){
            last=temp%10;
            for (int i = last; i >1 ; i--) {
                res=res*i;
            }
            sum=sum+res;
            res=1;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println(num+" is an strong number.");
        }else{
            System.out.println(num+" is not an strong number.");
        }
    }
}
