//Find the sum of digits in a given number n

import java.util.Scanner;

public class a52_sum_digit {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Number");
         int n=sc.nextInt();
            
         // WHILE LOOP
//          int ans=0;
// while(n!=0){
//     ans+=n%10;
//     n=n/10;

// }
// System.out.println(ans);
//FOR LOOP
int ans=0;
for(;n!=0;){
 ans+=n%10;
n=n/10;


}

System.out.println(ans);
    }
}
