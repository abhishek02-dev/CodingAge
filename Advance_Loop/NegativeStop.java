package Advance_Loop;

import java.util.Scanner;

public class NegativeStop {
    public static void main(String args[]){
            int num;
        Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            while(num>=0){
              //  System.out.println(num);
                num=sc.nextInt();
            }
            System.out.println("Found a negative number stop the loop.");
sc.close();
    }

}
