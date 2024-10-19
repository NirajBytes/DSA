//Ques: Take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15.

import java.util.Scanner;

public class a26_div5or3not15 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        // relational
    //(n%3==0 || n%5==0) is operation without () is going to give wrong answer bcause of precidance
        // if(n%15!=0 && (n%3==0 || n%5==0)){
        //     System.out.println(n+" is divisible by 5 and 3 bur not divisible by 15 ");
            
        // }
        // else{
        //     System.out.println(n+" is not able to satisfy condtion ");

        // }
        if (n%3==0) {
            if(n%5==0){
                if(n%15!=0){
                System.out.println(n+" is divisible by 5 and 3 bur not divisible by 15 ");
                }
                else{
                System.out.println(n+" is not able to satisfy condtion ");
            }
        }
        else{
            System.out.println(n+" is not able to satisfy condtion ");
        }
    } else {
            System.out.println(n+" is not able to satisfy condtion ");
        }
    }
}
