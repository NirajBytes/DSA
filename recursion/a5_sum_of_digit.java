public class a5_sum_of_digit {
    static int SOD(int n){
        // base case
        if (n>=0 &&n<=9) {
            return n;
        }
        // recursive work
       int smallans=n%10;
    //    self work
       return smallans+SOD(n/10);
    //    return SOD(n/10)+n%10;
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(SOD(n));
        
    }
}
