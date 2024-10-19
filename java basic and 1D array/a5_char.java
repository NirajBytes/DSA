import java.util.Scanner;

/************* GET CHAR VALUE INPUT ****************/
public class a5_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);//any input string but it print only element at 1st 
        System.out.println(ch);
        int x=sc.nextInt();
        System.out.println(x);
        float y=sc.nextFloat();
        System.out.println(y);
        boolean s =true;
        System.out.println(s);
        



    }
}

/******* SOME METHODS USED TO GET DIFF. INPUTS *********/
// nextInt() integers
// nextFloat() decimals
// nextBoolean() --for reading true or false value
// nextLine() ---for reading a line
// next() --- for reading only one word not a letter
// nextByte()-----
// nextDouble()
// nextShort()
// nextLong()