//take three input print gratest of them
import java.util.Scanner;

public class a23_greatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        int n1=sc.nextInt();
        System.out.println("Enter second number :");
        int n2=sc.nextInt();
        System.out.println("Enter third number :");
        int n3=sc.nextInt();
        // relatinal operator  condition
        // if (n1>n2 && n1>n3) {
        //     System.out.println(n1+" is greatest");
        // } else if(n2>n1 && n2>n3) {
        //     System.out.println(n2+" is greatest");
        // }
        // else{
        //     System.out.println(n3+" is greatest");
        // }
       // ************NESTED IF-ELSE METHOD ************

        if(n1>n2){//1 2 3
            if(n1>n3){
                System.out.println(n1+" is greatest");
            }
            else{
                System.out.println(n3+" is greatest");
            }
        }
            else{
                if(n2>n3){
                    System.out.println(n2+" is greatest");
                }
                else{
                    System.out.println(n3+" is greatest");
                }
            }
    }
}
