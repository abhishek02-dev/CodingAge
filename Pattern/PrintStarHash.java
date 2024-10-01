package Pattern;

import java.util.Scanner;

public class PrintStarHash {

        public static void main(String arg[]){
            int n;
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            for (int i = 0; i <n ; i++) {
                for (int j = 1; j <=n; j++) {
                    if(j%2==0) {
                        System.out.print("# ");
                    }else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }


