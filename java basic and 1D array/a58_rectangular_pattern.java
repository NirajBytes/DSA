
//RECTANGULAR PATTTERN  
import java.util.Scanner;

public class a58_rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int r = sc.nextInt();
        System.out.println("enter columns");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}