//Ques: Given the coordinates (x, y) of a center of a circle and its radius, write a program which will determine whether a point lies inside the circle, on the circle or outside the circle

import java.util.Scanner;

public class a29_pt_circle {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter points x cordinate  :");
        int x=sc.nextInt();
        System.out.println("Enter points y cordinate  :");
        int y=sc.nextInt();
        System.out.println("Enter radius of circle :");
        int r=sc.nextInt();
        // dist betn two points (((x2-x1)^2)-((y2-y1))^2)^1/2
        int OA = (x*x)+(y*y);
        if(OA>(r*r)){
            System.out.println("Given point is outside the circle ");
        }
        else if(OA==(r*r)){
            System.out.println("Given point is on circumference of  circle ");
        }
        else{
            System.out.println("Given point is inside the circle ");
        }
    }
}
