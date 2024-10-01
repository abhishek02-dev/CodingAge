package Array;

import java.util.Scanner;

public class IndexValue {
    public static void main(String[] args) {
        int n, key ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        key=sc.nextInt();

        for (int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
            if(i==key){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    }
