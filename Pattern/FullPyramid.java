package Pattern;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
//        for (int i =1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                if(j<=(n-i)){
//                    System.out.print(" ");
//                }else{
//                    System.out.print(" *");
//                }
//            }
//            System.out.println();
//        }
                for (int i =1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i % 2 != 0) {
                    if (j <= (n - i)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(" *");
                    }
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
