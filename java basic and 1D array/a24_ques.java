// if the age of ram shayam and ajay are input through a keyboard WAP to determine the youngest of them

import java.util.Scanner;

public class a24_ques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of ram :");
        int n1=sc.nextInt();
        System.out.println("Enter shayam :");
        int n2=sc.nextInt();
        System.out.println("Enter ajay :");
        int n3=sc.nextInt();
        // relatinal operator  condition
        // if (n1<n2 && n1<n3) {
        //     System.out.println("ram is youngest");
        // } else if(n2<n1 && n2<n3) {
        //     System.out.println("shayam is youngest");
        // }
        // else{
        //     System.out.println("ajay is youngest");
        // }
       // ************NESTED IF-ELSE METHOD ************

        if(n1<n2){//1 2 3
            if(n1<n3){
                 System.out.println("ram is youngest");
            }
            else{
                System.out.println("ajay is youngest");
            }
        }
            else{
                if(n2<n3){
                     System.out.println("shayam is youngest");
                }
                else{
                    System.out.println("ajay is youngest");
                }
            }
    }
}
