/**
 * print all naturalnumbers from 1 to n using recursion  
 */
public class a1_natural {
    static void Printdecreasing(int n){// 4 3 2 1 
        if (n==1) {
            System.out.println(n);
            return;

        }
        System.out.println(n);
        Printdecreasing(n-1);

    }
    static void PrintIncreasing(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }

        PrintIncreasing(n-1);//1,2,3,4,5,..........n-1
        System.out.println(n);
    }
public static void main(String[] args) {
    int n=4;
    // PrintIncreasing(n);
    Printdecreasing(n);
}
    
} 