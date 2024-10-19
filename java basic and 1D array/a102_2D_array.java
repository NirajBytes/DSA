import java.util.Scanner;

public class a102_2D_array {
    void multiarray() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr[i].length); j++) {//arr[i].length //every eleement in 2d array also show 2d array is array in array]
                System.out.print("Enter arr[" + i + "][" + j + "] Element");
                arr[i][j] = sc.nextInt();
            }
        }

            for (int k = 0; k < arr.length; k++) {
                for (int j = 0; j < arr[k].length; j++) {
                    System.out.print(arr[k][j] + " ");
                }
                System.out.println();
            }
            // arr[i].length means {1,2,3} ki length
    }

    public static void main(String[] args) {
        a102_2D_array s = new a102_2D_array();// object creation
        s.multiarray();// method calling
    }
}
