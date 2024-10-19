import java.util.Scanner;

public class a134_prefixsum {
    static int[] pefix(int [] arr){
        int n=arr.length;
        int []prefix=new int[n];
        prefix[0]=arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;

    }
    static void disp(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
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
        System.out.println("Original array");
        disp(arr);
        int []prefix=pefix(arr);
        System.out.println("prefixed array");
        disp(prefix);
    }
}
