import java.util.Scanner;

public class a73_sunglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int r = sc.nextInt();
        for (int i = r; i >= 1; i--) { // traversing along the rows
            // printig r-i spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            // print 2*i-1 stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 2; i <= r; i++) { // traversing along the rows
            // printig r-i spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            // print 2*i-1 stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
