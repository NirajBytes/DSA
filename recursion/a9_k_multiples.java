public class a9_k_multiples {
    static void printmultiples(int n,int k){
        //base case
        if (k==0) { 
            return;
        }
        //recursive work
        printmultiples(n, k-1);
        //self work 
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        int n=5,k=4;
        printmultiples(n,k);
    }
}
