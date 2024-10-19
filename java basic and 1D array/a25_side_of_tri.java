//take three input and tell if it is a side of triangle

import java.util.Scanner;
//hint // condition 
// side1+side 2>side 3 
//side 2+side 3 > side 1
//side 1 +side 3>side 2
public class a25_side_of_tri {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1 :");
        int n1=sc.nextInt();
        System.out.println("Enter side 2 :");
        int n2=sc.nextInt();
        System.out.println("Enter side 3 :");
        int n3=sc.nextInt();
                // relatinal operator  condition
        // if(n1+n2>n3 && n1+n3>n2 && n2+n3>n1){
        //     System.out.println("Given sides is sides of triangle");
        // }
        // else{
        //     System.out.println("Given sides is not sides of triangle");
        // }
       // ************NESTED IF-ELSE METHOD ************
        if (n1+n2>n3) {
            if(n2+n3>n1){
                if(n3+n1>n2){
                System.out.println("Given sides is sides of triangle");
                }
                else{
                    System.out.println("Given sides is not sides of triangle"); 
                }
            }
            else{
                System.out.println("Given sides is not sides of triangle"); 
            }
        } else {
      System.out.println("Given sides is not sides of triangle"); 
        }
    }
}
