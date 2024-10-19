import java.util.Scanner;

public class a122_last_sec_min {
    static int find_MIN(int[] arr1) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (min>arr1[i]) {
                min = arr1[i];
            }
        }
        return min;
    }
    static int sec_MIN(int []arr2){
        
        int mn=find_MIN(arr2);
    for (int i = 0; i < arr2.length; i++) {
        if(arr2[i]==mn){    
            arr2[i]=Integer.MAX_VALUE;
        }
    }
    int sec_min=find_MIN(arr2);
    return sec_min;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("SECOND MIN IS "+sec_MIN(arr));
    }

}
