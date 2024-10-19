import java.util.Scanner;

public class a130_frq_arr {
    static int[] Makefreqarr(int arr[]) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter Array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = Makefreqarr(arr);
        System.out.println("enter queries");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("enter ther number to be searched");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }

            q--;
        }
    }
}
