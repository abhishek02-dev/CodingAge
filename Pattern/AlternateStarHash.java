package Pattern;

import java.util.Scanner;

public class AlternateStarHash {
    public static void main(String arg[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if(i%2==0) {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("# ");
                    }
                }else {
                    if(j%2==0){
                        System.out.print("# ");
                    }else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
