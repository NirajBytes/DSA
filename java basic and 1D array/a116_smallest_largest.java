import java.util.Arrays;
import java.util.Scanner;

public class a116_smallest_largest {
    static int[] smallest_largest(int[] arr1) {
        Arrays.sort(arr1);
        int[] ans = { arr1[0], arr1[arr1.length - 1] };
        return ans;

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
        int[] ans = smallest_largest(arr);
        System.out.println("Smallest" + ans[0]);
        System.out.println("Largest" + ans[1]);

    }
}
