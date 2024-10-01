package Advance_Loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a,b,n1=0,n2=1,n3,temp;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
       // System.out.print(n1+" "+n2+" ");
        if(a==0){
            System.out.print(0+" "+1+" ");
        } else if (a==1) {
            System.out.print(1+" ");
        }
        temp=a;
            while(temp<=b){

                n3=n1+n2;
                n1=n2;
                n2=n3;
                if(n3>=a && n3<=b){
                    System.out.print(n3+" ");
                }
                temp++;
            }
        }
    }
