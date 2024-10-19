import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max1=0,max2=0;
    
        int arr[]=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            // System.out.print(" I LOVE JAVA ");
            if(arr[i]<max1){
                max2=max1;
            }
            if(max2>arr[i]&&arr[i]<max1){
                max2=arr[i];
            }

        }
        System.out.println(max1);
        System.out.println(max2);

    }
}
