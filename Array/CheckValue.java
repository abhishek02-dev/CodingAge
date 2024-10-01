package Array;

import java.util.Scanner;

public class CheckValue {
    public static void main(String[] args) {
        int n, key ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        key=sc.nextInt();

        for (int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
            if(arr[i]==key){
                System.out.println(key+" is present");
                break;
            }else{
                if(i== arr.length-1){
                    System.out.println(key+" is not present");
                }

            }
        }
    }
}
