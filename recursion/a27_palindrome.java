public class a27_palindrome {
    static String reverse(String s,int idx){
        //base case 
        if (idx==s.length()) {
            return "";
        }
        //recursive work 
        String sm=reverse(s, idx+1);
        //self work
        return sm+s.charAt(idx);
    }
    public static void main(String[] args) {
        String s="level";
        String rev=reverse(s, 0);
        if (rev.equals(s))
            System.out.println("is palindrome");
        else
        System.out.println("is not palindrome");

    }
    
}
