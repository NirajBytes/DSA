//Ques: Given a point (x, y), write a program to find out if it lies on the x-axis, y-axis or at the origin, viz. (0, 0).

import java.util.Scanner;

public class a28_pos_pt {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter points x cordinate  :");
        int x=sc.nextInt();
        System.out.println("Enter points y cordinate  :");
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("Given point is lie on origin");
        }
        else if(x==0){
            System.out.println("Given point is lie on y");
        }
        else if(y==0){
            System.out.println("Given point is lie on x");
        }
        else{
            System.out.println("Given point is lie in space"); 
        }
    }
}
