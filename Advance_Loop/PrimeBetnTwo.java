package Advance_Loop;

import java.util.Scanner;

public class PrimeBetnTwo {
    public static void main(String[] args) {
        int a,b,count=0;
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for (int i = a; i <=b ; i++) {
if (i!=0 && i!=1 && i!=2) {
    for (int j = 2; j < i; j++) {

        if (i % j == 0) {
            count++;
        }
    }
    if (count == 0) {
        System.out.println(i + " is prime number.");
    }
    count = 0;
}
        }
    }
}
