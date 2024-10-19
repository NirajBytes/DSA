public class a4_fibonacci {
    static int fib(int n){
        if (n==0 ||n==1) {
            return n;
        }
        // if (n==0) {
        //     return 0;
        // }
        // if (n==1) {
        //     return 1;
        // }
        return fib(n-1)+fib(n-2);

        // int prev=fib(n-1);
        // int preprev=fib(n-2);
        // return prev+preprev;


    }
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println(fib(i));
        }
    }
}
