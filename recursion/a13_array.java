public class a13_array {
    static void ArrayRecursion(int [] arr,int idx){
        int n=arr.length;
        // base case
        if (idx==n) return ;
        // self work
        System.out.print(" "+arr[idx]);
        // recursive work
        ArrayRecursion(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={5,7,8,1};
        int idx=0;
        ArrayRecursion(arr,idx);
    }
}
