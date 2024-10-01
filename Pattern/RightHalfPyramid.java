package Pattern;

import java.util.Scanner;

public class RightHalfPyramid {

    public static void main(String arg[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
