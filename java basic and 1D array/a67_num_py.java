import java.util.Scanner;

public class a67_num_py {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            //spaces
            for(int k=1;k<=r-i;k++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int f=i-1;f>=1;f--){
                System.out.print(f);

            }

            System.out.println();
        }
    }
}
