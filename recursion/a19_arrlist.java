import java.util.ArrayList;

public class a19_arrlist {
    static ArrayList<Integer> allindices(int[] a, int n, int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        // base case
        if (idx >= n) {
            return ans;
            // self work

        }
        if (a[idx] == target) {
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallans = allindices(a, n, target, idx + 1);
        ans.addAll(smallans);
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 4, 53, 2, 2 };
        int target = 2;
        int n = arr.length;
        ArrayList<Integer> ans = allindices(arr, n, target, 0);
        for (Integer i : ans) {
            System.out.print(i + " ");
        }
    }
}
