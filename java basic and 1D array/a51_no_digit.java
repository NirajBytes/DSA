// Count the number of digits for a given number n

import java.util.Scanner;

public class a51_no_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
    int n=sc.nextInt();
    // WHILE LOOP
//     int s=0;
//     while(n!=0){
//         n=n/10;
// s++;
//     }
//     System.out.println(s);
//FOR LOOP
int i=0;
for(;n!=0;i++){
    n=n/10;

}
 System.out.println(i);
    }
}