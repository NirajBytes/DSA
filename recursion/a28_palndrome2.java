public class a28_palndrome2 {
    static String reverse(String s){
        //base case
        if (s.length()==0) {
            return "";
        }
        //recursive work
        String sm=reverse(s.substring(1));
        return sm+s.charAt(0);

    }
    public static void main(String[] args) {
        String s="level";
        String rev=reverse(s);
        if (rev.equals(s))
            System.out.println("is palindrome");
        else
        System.out.println("is not palindrome");
    }
}
