import java.util.Scanner;
public class a75_decimal_to_bi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number ");
        int n = sc.nextInt();
        int sum = 0, ans = 0;
        // this is not an optimized code
        while (n != 0) {
            int rem = n % 2;// parity
            sum = sum * 10 + rem;
            n /= 2;
        }
        // GETTING ANSWER IN REVERSE FORM
        // HENCE REVERSE THE SUM
        while (sum != 0) {
            ans = (ans * 10) + (sum % 10);
            sum /= 10;
        }
        // // BELOW CODE IS OPTIMIZED CODE
        // int ans=0,pw=1;
        // while(n!=0){
        // int parity=n%2;
        // ans=ans+(parity*pw);
        // pw*=10;
        // n/=2;
        // }
        System.out.println(ans);
    }
}
