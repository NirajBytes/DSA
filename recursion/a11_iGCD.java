public class a11_iGCD {
    static int GCD(int x,int y){
        while (x%y!=0) {
            int rem=x%y;
            x=y;
            y=rem;


        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(GCD(56,48));
    }
}
