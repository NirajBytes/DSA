import java.util.Scanner;

public class a65_alt_num_pattern {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int r=sc.nextInt();
        System.out.println("Enter Number of columns");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if((i+j)%2==0)
                System.out.print(1);
                else
                System.out.print(2);
            }
            System.out.println();
        }
    }
}
