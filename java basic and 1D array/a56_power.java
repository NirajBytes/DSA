// give 2 numbers a and b and printthe a to the power b
import java.util.Scanner;

public class a56_power {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
System.out.println("enter number");
int a=sc.nextInt();
System.out.println("enter power");
        int b=sc.nextInt();
        //for loop
        // int ans =1;
        // for(int i=0;i<b;i++)
        // {
        //     ans*=a;

        // }
        // System.out.println(ans+" is "+a+" to the power " +b);
        //while loop
        int ans =1;
        int i=1;
        while(i<=b){
            ans*=a;
            i++;
        }
        System.out.println(ans+" is "+a+" to the power " +b);
        


    }
}
