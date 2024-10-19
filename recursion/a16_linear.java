public class a16_linear {
    static boolean search(int [] a, int target,int n,int idx){
        // base case
        if (idx>=n) {
            return false;
        }
        //self work
        if (a[idx]==target) {
            return true;
        }
        //recursive work
        return search(a, target, n, idx+1);
        

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int target=74;
        if (search(arr,target,arr.length,0)) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");

        }
    }
}
