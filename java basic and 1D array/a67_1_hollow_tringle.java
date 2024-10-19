import java.util.Scanner;

public class a67_1_hollow_tringle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            /* Print trailing spaces */
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            /* Print hollow tringle */
            for (int j = 1; j <=  i; j++) {
                /*
                 * Print star for last row (i==rows),
                 * first column(j==1) and for
                 * last column (j==(2*i-1)).
                 */
                if (i == rows || j == 1 || j ==  i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
