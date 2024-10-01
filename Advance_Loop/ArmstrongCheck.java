package Advance_Loop;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int num,temp,sum=0,last,digit=0,res=1;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=num;
        while (temp>0){
            last=temp%10;
            for (int i = 0; i <digit ; i++) {
                res =res*last;
            }
            sum=sum+res;
            res=1;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println(num+" is an armstrong number.");
        }else{
            System.out.println(num+" is not an armstrong number.");
        }
    }
}


