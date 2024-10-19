public class a3_factorial {
    static int factorial(int n){
        // base case
        if (n==0)
            return 1;
            // smaller subproblem _ recursive work
            int smallans=factorial(n-1);//factorial(4)=24
            //big problem self work
            int ans=n*smallans;//5*factorial(4)
return ans;

        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}
