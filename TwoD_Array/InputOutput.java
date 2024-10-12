package TwoD_Array;

import java.util.Scanner;

public class InputOutput {

        public void input(int s,int j,int arr[][]){
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < s; i++) {
                for (int k = 0; k <j ; k++) {
                    arr[i][k]= sc.nextInt();
                }

            }
            System.out.println();
        }
        public void output(int s,int j,int arr[][]){
            for (int i = 0; i < s ; i++) {
                for (int k = 0; k <j ; k++) {
                    System.out.print(arr[i][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n,m;
            n=sc.nextInt();
            m=sc.nextInt();
            int arr1[][]=new int[n][m];

            Array.InputOutput io =new Array.InputOutput();
//            io.input(2,3,arr1[][]);
//            io.output(2,3,arr1[][]);


        }
    }


