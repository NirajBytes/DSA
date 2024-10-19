
//lecture 19
import java.util.Scanner;

public class a136_prefixsuminrange {
    static int[] prefixsum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;

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
        int[] arr = new int[n + 1];
        System.out.println("Enter array elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        disp(arr);
        int[] prefix = prefixsum(arr);
        System.out.println("prefixsum array");
        disp(prefix);
        System.out.println("Enter number of test case");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefix[r] - prefix[l - 1];
            System.out.println("Sum is : " + ans);
        }

    }
}
