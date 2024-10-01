package Advance_Loop_Pattern;

import java.sql.SQLOutput;
import java.util.Scanner;

//ABC
//B
//C
public class Pattern_13 {
    public static void main(String[] args) {
char c;
        Scanner sc = new Scanner(System.in);
        c=sc.next().charAt(0);
        for (char i = 'A'; i <=c ; i++) {
            for (char j = 'A'; j <=c ; j++) {
                if(i=='A'){
                    System.out.print(j);
                } else  {
                    if(i>'A' && j=='A'){
                        System.out.print(i);
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
