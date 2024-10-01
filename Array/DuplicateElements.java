package Array;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            //:[3,2,4,7,2,9,5,1,2]
            if(count>1){
                System.out.println(arr[i]+" is repeated ,count is "+(count-1));
                break;
            }
        }
        }
}
