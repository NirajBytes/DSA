
public class a97_2D_array {
    void multiarray() {
        // int [][] arr=new int[2][3];//declearv 1 2 3
        // 5 6 7
        // arr [0][0] = 1;
        // arr [0][1] = 2;
        // arr [0][2] = 3;
        // arr [1][0] = 5;
        // arr [1][1] = 6;
        // arr [1][2] = 7;
        // OR
        int[][] arr = { { 1, 2, 3 }, { 5, 6, 7 } };
        System.out.println(arr[0][0] + " " +
                arr[0][1] + " " +
                arr[0][2] + "\n" +
                arr[1][0] + " " +
                arr[1][1] + " " +
                arr[1][2] + "\n ");
        System.out.println("what if we want large array to be print ? : use  loops");

    }

    public static void main(String[] args) {
        a97_2D_array s = new a97_2D_array();// object creation
        s.multiarray();// method calling
    }
}
