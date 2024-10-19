import java.util.Scanner;

public class a82_sum_method {
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        a82_sum_method s = new a82_sum_method();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = s.sum(x, y);
        System.out.println("sum is " + ans);

    }
}
