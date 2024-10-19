import java.util.Scanner;

public class a22_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String s=sc.next(); for iput of only one word
        String s=sc.nextLine();
        System.out.println(s);
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.println(s.charAt(i));
        // }
        // System.out.println(s.substring(2,4));//here 2 is inclosive and 4 is exclusive
        
        // String s1="niraj",s2="balpande";
        // String s3=s1+s2;// is valid operation
        // System.out.println(s3);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(1));
        }

    }
    
}
