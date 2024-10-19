import java.util.Scanner;

public class a70_inverse_pyramid {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int r = sc.nextInt();
        for(int i=r;i>=1;i--){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");

            }
           
            for(int l=1;l<=2*i-1;l++){

                System.out.print("*");
            }
            
            System.out.println();
        } 
    }
}
