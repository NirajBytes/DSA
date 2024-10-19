import java.util.Arrays;
import java.util.Scanner;

public class a123_last_repeating {
    static int Repeating(int[] arr1) {
        int n = arr1.length;
        for (int i = n-1; i >= 0; i--) {
            for (int j = i -1; j >0; j--) {
                if(arr1[i]==arr1[j]){
                    return arr1[i];
                }
                }
            }
            return -1;

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int s=Repeating(arr);
if (s!=-1) {
    System.out.println("last repeating number is " + Repeating(arr));
} else {
    System.out.println("each element of array is distinct");
}
    }
}
