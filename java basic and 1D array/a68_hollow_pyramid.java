import java.util.Scanner;

public class a68_hollow_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            /* Print trailing spaces */
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            /* Print hollow pyramid */
            for (int j = 1; j <= (2 * i) - 1; j++) {
                /*
                 * Print star for last row (i==rows),
                 * first column(j==1) and for
                 * last column (j==(2*i-1)).
                 */
                if (i == rows || j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}