package Advance_Loop_Pattern;

import java.util.Scanner;

// 1     3     5
//    B     D
// 6     8    10
//    G      I
// 11    13    14
public class Pattern_17 {
    public static void main(String[] args) {
        int n,temp=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        char c='A';
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i%2!=0){
                    if(j%2!=0){
                        System.out.print(temp);
                        temp++;
                    }else{
                        System.out.print(" ");
                        temp++;
                    }
                }else{
                    if(j%2==0){
                        System.out.print(c);
                        c++;
                }else{
                        System.out.print(" ");
                        c++;
                    }

                }
            }
            System.out.println();
        }
    }
}
