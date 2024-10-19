import java.util.Scanner;

public class a137_equalarray {
    static int findarraysum(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    static boolean equalarr(int [] arr){
        int totalsum=findarraysum(arr);
        int prefixsum=0;
        for (int i = 0; i < arr.length; i++) {
            prefixsum+=arr[i];
            int suffixsum=totalsum-prefixsum;
            if (prefixsum==suffixsum) {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter array elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        if (equalarr(arr)) {
            System.out.println("partion possible");
        }
        else{
            System.out.println("partion impossible");

        }
        
    }
}
