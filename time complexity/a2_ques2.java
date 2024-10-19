public class a2_ques2 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 };
        int n = arr1.length, m = arr2.length;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(" " + arr2[i]);

        }
    }

}
// Time complexity O(m+n)
