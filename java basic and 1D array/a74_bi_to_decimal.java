import java.util.Scanner;

public class a74_bi_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number ");
        int n = sc.nextInt();// 1001
    int orginal=n;
        int m = 1;
        int sum = 0;
        while (n != 0/* OR n>0 */) {
            int l = n % 10;
            // r=l*m;
            // sum+=r;
            // OR
            sum =sum + l * m;
            m = m * 2;
            n = n / 10;
        }
        System.out.println(sum +" is decimal form of "+orginal);
    }
}
