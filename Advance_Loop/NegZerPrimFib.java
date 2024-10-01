package Advance_Loop;

import java.util.Scanner;

public class NegZerPrimFib {
    public static void main(String[] args) {
        int n,count=0,n1=0,n2=1,n3,temp,count1=0;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        if (n>=1) {
        int j=1;
                while (j<=n){
                temp = 0;
                while (temp <= n ) {

                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    System.out.println(n3);
                    if (n3 == n) {
                        count1++;
                       //System.out.println(count1);
                    }
                    temp++;
                }
                if (n==1){
                    count=1;
                }
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        count++;
                    }

                }
                System.out.println("count is "+count);
                System.out.println("count1 is "+count1);
                if (count == 0 && count1 == 1) {
                    System.out.println(n + " is prime and also fibonacci number");
                } else if (count == 0 && count1 == 0) {
                    System.out.println(n + " is prime but not a fibonacci number");
                } else if (count > 0 && count1 == 1) {
                    System.out.println(n + " is not prime but fibonacci number");
                } else {
                    System.out.println(n + " is not prime and also not a fibonacci number");
                }
                count1=0;
                count=0;
                n1=0;
                n2=1;
                n = sc.nextInt();

            }
            if (n==0){
                System.out.println(n+" found zero so getting out of loop.");
            }else {
                System.out.println(n+" found negative number so getting out of loop.");
              }

        }else if (n==0){
            System.out.println(n+" found zero so getting out of loop.");
        }else{
            System.out.println(n+" found negative number so getting out of loop.");
        }
       }
    }


