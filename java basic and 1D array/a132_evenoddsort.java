//LECTURE 18
/*Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition */
import java.util.Scanner;

public class a132_evenoddsort {
    static void disp(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static void swap(int []arr,int i,int j){
        int n=arr.length;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
static void sortby_parity(int []arr){
int n=arr.length;
    int i=0,j=n-1;
    while (i<j) {
        if(i%2==1 && j%2==0){
            swap(arr,i,j);
            i++;
            j--;
        }
        if(i%2==0){
            i++;
        }
        if(j%2==1){
            j--;
        }
    }
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
        sortby_parity(arr);
        System.out.println("Sorted array");
        disp(arr);

    

    }
}
