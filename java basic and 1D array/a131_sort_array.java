/* sort asn array consisting o's and 1's */
import java.util.Scanner;

public class a131_sort_array {
    static void disp(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    static void sotedzerosandone(int[] arr) {
        int zeros = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0)
            zeros++;

        }
        for (int i = 0; i <n; i++) {
            if(i<zeros)
            arr[i]=0;
            else
            arr[i]=1;
        }

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
        System.out.println("original array");
        disp(arr);
        sotedzerosandone(arr);
        System.out.println("Sorted array");
        disp(arr);

    }
}
