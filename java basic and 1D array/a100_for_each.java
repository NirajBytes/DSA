import java.util.Scanner;

public class a100_for_each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {// taking input
            System.out.println("Enter element at index: " + i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Given array is ");
        for (int b : arr) {//limitatins// taking output//this method only print all array elements every time
            System.out.print(b + " ");
        }
    }
}
