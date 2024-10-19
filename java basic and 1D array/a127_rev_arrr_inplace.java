//in space means no extra memory allocated
public class a127_rev_arrr_inplace {
    static int[] rev(int arr[]) {
        int n = arr.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;

    }

    static void desp(int ara[]) {
        for (int i = 0; i < ara.length; i++) {
            System.out.print(ara[i] + " ");

        }
            System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int[] ans = rev(arr);
        desp(ans);

}
}
