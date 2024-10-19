public class a14_maxarray {
    static int MAxarr(int [] arr,int idx){
        int n=arr.length;
        //base case
        if (idx==n-1) return arr[idx];
        //small problem 
        int smallans=MAxarr(arr,idx+1);
        //self work
        return Math.max(smallans, arr[idx]);
    }
    public static void main(String[] args) {
        int [] arr={7,4,9,23,76};
        System.out.println(MAxarr(arr,0));
    }
}
