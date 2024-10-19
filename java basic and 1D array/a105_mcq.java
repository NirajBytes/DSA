// Search the given element x in the array. If present then return the index else return -1.
// Input: arr[] = {1, 5, 3}
// x = 5
// Output: 1
public class a105_mcq {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3 };
        int x = 5;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                System.out.println("element found at index " + ans);
                break;
            }

        }
        if (ans == -1) {
            System.out.println("element not found");
        }

    }
}