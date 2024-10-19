import java.util.Scanner;

public class a112_mcq {
    static int occurencess(int[] arr1,int x1){
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==x1){
                count++;
            }
            
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element you want to find");
        int x=sc.nextInt();
        System.out.println("Count of element "+occurencess(arr, x));
    }
}
