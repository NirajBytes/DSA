public class a17_firstidx {
    static int search(int [] a, int target,int n,int idx){
        // base case
        if (idx>=n) {
            return -1;
        }
        //self work
        if (a[idx]==target) {
            return idx;
        }
        //recursive work
        return search(a, target, n, idx+1);
        

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int target=4;
        int n=arr.length;
        int result=search(arr, target, n, 0);
        if (result!=-1) {
            System.out.println("index found is "+result);
        }
        else{
            System.out.println("not found");
        }
    
    }
}
