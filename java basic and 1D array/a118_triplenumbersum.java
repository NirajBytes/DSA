import java.util.Arrays;
import java.util.Scanner;

public class a118_triplenumbersum {
    static int targetsum(int[] arr1, int x) {
        int n = arr1.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int j2 = j + 1; j2 < n; j2++) {
                    if (arr1[i] + arr1[j] + arr1[j2] == x) {
                        ans++;
                    }
                }
            }

        }
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
        System.out.println("Enter target");
        int target = sc.nextInt();
        System.out.println("number of pairs is " + targetsum(arr, target));
    }
}
