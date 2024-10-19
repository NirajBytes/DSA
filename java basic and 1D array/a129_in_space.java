import java.util.Scanner;

public class a129_in_space {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] rev(int[] arr, int i, int j) {
        int n = arr.length;
        for (; i < j; i++, j--) {
            swap(arr, i, j);
        }   
        return arr;

    }

    static void disp(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
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
        System.out.println("Enter steps you want to rotate ");
        int k = sc.nextInt();
        k = k % n;
        rev(arr, 0, n - k - 1);
        rev(arr, n - k, n - 1);
        rev(arr, 0, n - 1);
        disp(arr);

    }
}