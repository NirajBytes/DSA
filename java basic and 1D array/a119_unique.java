
//find the unique number in given array where all the element being repeated twice with one value being unique
import java.util.Arrays;
import java.util.Scanner;

public class a119_unique {
    static int unique(int[] arr1) {
        int n = arr1.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] == arr1[j]) {
                    arr1[i] = -1;
                    arr1[j] = -1;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr1[i] > 0)
                ans = arr1[i];
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

        System.out.println("unique number is " + unique(arr));
    }
}
