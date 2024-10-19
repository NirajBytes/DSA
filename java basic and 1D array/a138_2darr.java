import java.util.Scanner;

public class a138_2darr {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size"); 
        int r = sc.nextInt();
        System.out.println("Enter column size");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
    
        }
        System.out.println( "array is");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
