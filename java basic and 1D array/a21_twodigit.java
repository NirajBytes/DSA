// take interger input check wether it is two digit or not

import java.util.Scanner;

public class a21_twodigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        double n =sc.nextDouble();
        //by relational operator
        // if(n>=10 && n<100){
        //     System.out.println(n+" is two digit number");
        // }
        // else{
        //     System.out.println(n+" is not two digit number");
        // }
        // ************NESTED IF-ELSE METHOD ************
        if(n>9){
            if(n<100){
                System.out.println(n+" is two digit number");
            }
            else{
                System.out.println(n+" is not two digit number");
            }
        }
        else{
            System.out.println(n+" is not two digit number");
        }
    }
}
