package Pattern;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        int n=1;
        char c='A';
        for(int i=1;i<=6;i++){
            for(int j=1;j<4;j++){
                if(i==1){
                    System.out.print("*");
                } else if (i==6) {
                    System.out.print("#");
                }else {
                    if (i % 2 == 0) {
                        System.out.print(c);
                        c++;
                    } else {
                        System.out.print(n);
                        n++;
                    }
                }
            }
            System.out.println();
        }
    }
}
