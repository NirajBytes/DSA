// Ques: Take integer input and print the absolute value of that integer

import java.util.Scanner;

public class a19_absolutevalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n<0) {
            System.out.println(n*(-1)+" is absolute value");
        } else {
            System.out.println(n+" is absolute value");
            
        }
    }
}
