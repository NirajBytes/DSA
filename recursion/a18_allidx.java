public class a18_allidx {
    static void allindex(int []a,int n,int target ,int idx){
        //base case
        if (idx>=n) {
            return;
        }
        if (a[idx]==target) {
            System.out.print(" "+idx);
        }
        allindex(a, n, target, idx+1);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,2,2,2};
        int n=arr.length;
        int target=2;
        allindex(arr, n, target, 0);
    }
}
