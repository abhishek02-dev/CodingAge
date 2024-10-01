package Array_Dsa;

import java.util.Scanner;

public class PairOfSum {
        public static void main(String[] args) {
            int n,sum;
            Scanner sc =new Scanner(System.in);
            sum=sc.nextInt();
            n=sc.nextInt();

            int arr[]=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }

            for (int i = 0; i <n ; i++) {
                for (int k = i+1; k <n ; k++) {
                if(arr[i]+arr[k]==sum) {
                    System.out.println("index "+i+" and "+k+" sum is equals to "+sum);
                }
                }

                }
            }


        }



