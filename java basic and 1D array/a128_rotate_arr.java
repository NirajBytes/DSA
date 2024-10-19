import java.util.Arrays;
import java.util.Scanner;

public class a128_rotate_arr {
    static int[] Rotate(int[] arr1, int k) {
        int n = arr1.length;
        k = k % n;
        int j = 0;
        int ans[] = new int[n];
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr1[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr1[i];
        }
        return ans;
    }

    static void desp(int ara[]) {
        for (int i = 0; i < ara.length; i++) {
            System.out.print(ara[i] + " ");

        }
        System.out.println();
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
        System.out.println("Enter number of Rotation you want");
        int k = sc.nextInt();
        System.out.println("Original array before rotate ");
        desp(arr);
        System.out.println("array after rotate ");
        int ans[] = Rotate(arr, k);
        desp(ans);

    }
}
