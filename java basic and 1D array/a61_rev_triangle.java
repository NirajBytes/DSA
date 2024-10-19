import java.util.Scanner;

public class a61_rev_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int r = sc.nextInt();
        // 1 ST METHOD
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= (r+1-i); j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }

        // 2ND METHOD
        // for (int i = r; i >= 1; i--)
        for (int i = 0; i <= r; i++) {
            // for (int j = 1; j <=i; j++)
            for (int j = r; j >= i; j--)

            {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
