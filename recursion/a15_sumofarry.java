public class a15_sumofarry {
    static int SOA(int []arr,int idx){
        int n =arr.length;
        //base case
        if (idx==n-1) {
            return arr[idx];
        }
        //recursive work
        int small=SOA(arr, idx+1);
        // self work
        return small+arr[idx];


    }
    public static void main(String[] args) {
        int [] arr={1,2,3,9,4};
        System.out.println(SOA(arr,0));
    }
}
