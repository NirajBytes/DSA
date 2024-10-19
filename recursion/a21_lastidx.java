public class a21_lastidx {
    static int lastidx(int []a,int target ,int idx){
        if (idx<0) {
            return -1;
        }
        if (a[idx]==target) {
            return idx;
        }
    return lastidx(a, target, idx-1);

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,2,4,5,3,2,8,7,6,5};
        int n=arr.length;
        int target =2;
        int result=lastidx(arr,target,n-1);
        if (result==-1) {
            System.out.println("not found");
        }
        else{
            System.out.println("found at index "+result);
        }

    }
}
