package Pattern;

import java.util.Scanner;

public class PrintStar {
    public static void main(String arg[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
