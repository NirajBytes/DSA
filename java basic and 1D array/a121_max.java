import java.util.Arrays;
import java.util.Scanner;

public class a121_max {
    static int Maximum(int[] arr1) {
        int n = arr1.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }

        }
        return max;

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

        System.out.println("MAX number is " + Maximum(arr));
    }
}
