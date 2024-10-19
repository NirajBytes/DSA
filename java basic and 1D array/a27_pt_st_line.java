///Ques: Given three points (x1,y1), (x2, y2) and (x3, y3), write a program to check if all the three points fall on one straight line.

import java.util.Scanner;

public class a27_pt_st_line {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter point 1 :");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.println("Enter point 2 :");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        System.out.println("Enter point 3 :");
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();
        //hint slope is same
        double m1=(y2-y1)/(x2-x1);
        double m2=(y3-y2)/(x3-x2);
        if (m1==m2) {
            System.out.println("Given points is lie in straight line ");
        } else {
            System.out.println("Given points is not lie in straight line ");
            
        }

    }
}
