import java.util.Scanner;

public class a108_Shallow_copy {

    public static void printing(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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
        System.out.println("original arr");
        printing(arr);
        int[] arr_2 = arr.clone();//gives storage to heap as per array size
        System.out.println("copied arr_2");
        printing(arr_2);
        // below is shallow copy proof
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("original arr after changing arr_2");
        printing(arr);
        System.out.println("copied arr_2 after changing arr_2");
        printing(arr_2);
    }
}
