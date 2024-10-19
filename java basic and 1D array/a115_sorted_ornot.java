import java.util.Scanner;

public class a115_sorted_ornot {
    static boolean isSorted(int[] arr1) {
        boolean check = true;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < arr1[i-1] ) {
                check =false;
                break;
            }

        }
        return check;

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

        System.out.println("is sorted " + isSorted(arr));

    }
}
