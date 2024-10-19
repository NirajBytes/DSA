// Ques: Take positive integer input and tell if it is even or odd
import java.util.Scanner;
public class a16_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        if (n%2==0) {
            System.out.println(n+" is even number");
        } else {
            System.out.println(n+" is odd number");
            
        }



    }
}