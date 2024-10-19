// Reverse the digits of a number

import java.util.Scanner;

public class a53_rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        // int ans=0;
        // while(n!=0){
        // ans=(ans*10)+(n%10);
        // n/=10;

        // }
        // System.out.println(ans);

        // for loop
        int ans = 0;
        for (; n != 0;) {
            ans = (ans * 10) + (n % 10);
            n /= 10;

        }
        System.out.println(ans);

    }
}
