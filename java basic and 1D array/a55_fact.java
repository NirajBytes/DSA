// print the first n factorial number

import java.util.Scanner;

public class a55_fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");// 5
        // for loop
        int n = sc.nextInt();
        // int ans=1;
        // for(int i=1;i<=n;i++){
        // ans=ans*i;
        // System.out.println("factorial of "+i+" is "+ans);
        // while loop
        int ans = 1;
        int i = 1;
        while (i <= n) {
            ans = ans * i;
            System.out.println("factorial of " + i + " is " + ans);
            i++;
        }
    }
}
