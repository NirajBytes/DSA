//Take a Positive integer input and tell if it is divisible by 5 and 3

import java.util.Scanner;

public class a22_div5and3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
         // ************NESTED IF-ELSE METHOD ************
        // if (n%5==0) {
        //     if (n%3==0) {
        //         System.out.println(n+" is divisible by 5 and 3");
        //     } else {
        //         System.out.println(n+" is not divisible by 5 and 3");
                
        //     }
        // } else {
        //     System.out.println(n+" is not divisible by 5 and 3");
            
        // }
         // relational operator
            if (n%3==0 && n%5==0) {
                System.out.println(n+" is divisible by 5 and 3");
            } else {
                System.out.println(n+" is not divisible by 5 and 3");
                
            }
        

    }
    
}
