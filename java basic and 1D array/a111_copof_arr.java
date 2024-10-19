import java.util.Arrays;

public class a111_copof_arr {
    public static void printing(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        System.out.println("original array");
        printing(arr);

        int[] arr_2 =Arrays.copyOf(arr,arr.length);
        System.out.println("copied array");
        printing(arr_2);
        changeArray(arr_2);
        System.out.println("original array after chaanging arr_2");
        printing(arr);
        System.out.println("array after change ");
        printing(arr_2);

    }

}
