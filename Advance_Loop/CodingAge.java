package Advance_Loop;

import java.util.Scanner;

public class CodingAge {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for (int i = a ;i <=b ; i++) {
            if(i%2==0){
                System.out.print(i+". Coding ");
            }else{
                System.out.print(i+". Age ");
            }
        }

    }
}
