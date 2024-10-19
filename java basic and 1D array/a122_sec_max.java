import java.util.Arrays;
import java.util.Scanner;

public class a122_sec_max {
    static int Maximum(int[] arr1) {
        int n = arr1.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }

        }
        return max;

    }
    static int Secmax(int[] arr){
        int mx=Maximum(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
            
        }
        
        int secmac=Maximum(arr);
        return secmac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        

        System.out.println("second MAX number is " + Secmax(arr) );
        System.out.println("array after all operations is as follows ");
        for (int i : arr) {
            System.out.print(" "+i);//here actual array is change becuase of reference variable at stack memory 
        }
    }
}
