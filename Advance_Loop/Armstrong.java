package Advance_Loop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num1,num2,temp,sum=0,last,digit=0,res=1;
        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();
        num2= sc.nextInt();
        for (int i = num1; i <=num2 ; i++) {
            temp=i;
            sum=0;
            digit=0;
            while(temp>0){
                temp=temp/10;
                digit++;
            }
            temp=i;
            while (temp>0){
                last=temp%10;
                for (int j = 0; j<digit ; j++) {
                    res =res*last;
                }
                sum=sum+res;
                res=1;
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i+" is an armstrong number.");
            }
        }

    }
}
