//lecture 19
import java.util.Scanner;

public class a135_prefixinplace {
    static void prefix(int [] arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        // return arr;

    }
    static void disp(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        disp(arr);
        prefix(arr);
        System.out.println("prefixed array");
        disp(arr);
    }
}
