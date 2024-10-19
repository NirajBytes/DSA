// Ques: If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred

import java.util.Scanner;

public class a20_profit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cost Price ");
        int cp=sc.nextInt();
        System.out.println("Enter Selling Price ");
        int sp=sc.nextInt();
        int s=sp-cp;
        if (s>=0) {
            System.out.println(s+" is your profit");
        } else {
            System.out.println(s*(-1)+" is your loss");
            
        }

    }
}
