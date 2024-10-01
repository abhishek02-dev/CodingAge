package Pattern;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        char ch,temp;
        Scanner sc =new Scanner(System.in);
        ch=sc.next().charAt(0);
        for (char i = 'A'; i <=ch ; i++) {
            temp=i;
            for (char j='A'; j <=ch ; j++) {
                System.out.print(temp);
                temp+=1;
            }
            System.out.println();
        }
    }
}
