public class a20_issorted {
    static boolean issorted(int [] a,int n,int idx){
        if (idx==n-1) {
            return true;
        }
        if (a[idx]<a[idx+1]) {
           return issorted(a, n, idx+1);
        }
            else
            {
                return false;
            }
        
        

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int n=arr.length;
        if (issorted(arr, n, 0)) {
            System.out.println("Sorted");
        }
        else{
            System.out.println("UnSorted");

        }

    }
    
}
