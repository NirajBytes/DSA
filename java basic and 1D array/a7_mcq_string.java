import java.util.*;
// MCQ

//What is the output of the following code, if input is: hello world 21

public class a7_mcq_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String p = sc.next();

        int q = sc.nextInt();

        System.out.print(p + "" + q);

    }
}

// a) hello world 21

// b) InputMismatchException // correct ans

// c) hello 21

// d) hello