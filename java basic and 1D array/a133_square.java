/*Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order. */
// eg array -10,-2,1,2,2,3,6

import java.util.Scanner;

public class a133_square {
    static void swap(int[] arr, int i, int j) {
        int n = arr.length;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverse(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;// we can give this command in swap function or method because it is primitive
                // data type which store in stack memory that can be change for this method if
                // we do this
            j--;

        }

    }

    static void disp(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int[] sort(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1, k = 0;
        int[] ans = new int[n];

        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k++] = arr[i] * arr[i];
                i++;
            } else {

                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;

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
        int[] ans = sort(arr);
        reverse(ans);
        System.out.println("Sorted array");
        disp(ans);
    }

}