import java.util.Scanner;

public class a101_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {// taking input
            System.out.println("Enter element at index: " + i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Given array is ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i += 1;
        }
    }
}
