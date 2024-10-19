// Try This
// Calculate the maximum value out of all the elements in the array.
// Input: arr[] = {1, 5, 3} Output: 5
public class a104_mcq {
    public static void main(String[] args) {
        int  arr[]={1,5,3};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max is :" +max);
    }
    
}