package Pattern;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            temp=i;
            for (int j = 1; j <=n ; j++) {
                System.out.print(temp);
                temp+=1;
            }
            System.out.println();
        }
    }
}
