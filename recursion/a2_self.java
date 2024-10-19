public class a2_self {
   static int i=1;
    static void printn(int n){
        if (i>n) {
            System.out.println(i);
            return;
        }
        else{
            printn(n-1);
            System.out.println(i++);
        }
    }
    public static void main(String[] args) {
        int n =10;
        printn(n);
    }
}
